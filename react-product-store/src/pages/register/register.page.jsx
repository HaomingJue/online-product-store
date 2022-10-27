import { faUserCircle } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { useEffect } from "react";
import { useState } from "react";
import { useSelector } from "react-redux";
import { useNavigate } from "react-router-dom";
import User from '../../models/user';
import AuthenticationService from '../../services/authentication.service'; 
import './register.page.css';

const RegisterPage = () => {
    const [user, setUser] = useState(new User('','','',));
    const [loading, setLoading] = useState(false);
    const [submitted, setSubmitted] = useState(false);
    const [errorMessage, setErrorMessage] = useState('');

    const currentUser = useSelector(state => state.user);
    const navigate = useNavigate();

    useEffect(() => {
        if (currentUser?.id) {
            //navigate
            navigate('/profile');
        }
    }, []);


    const handleChange = (e) => {
        const {name, value} = e.target;
        setUser((prevState => {
            //e.g: prevState ({user: x, pass: x}) + newKeyValue ({user: xy}) => ({user: xy, pass: x})
            return {
                ...prevState,
                [name]: value
            };
        }))
    }
    
    
    const handleRegister = (e) => {
    
        e.preventDefault();
    
        setSubmitted(true);
    
        if (!user.username || !user.password || !user.name) {
            return;
        }
    
        setLoading(true);
    
        AuthenticationService.register(user).then(() => {
            navigate('/login');
        }).catch(error => {
            console.log(error);
            if (error?.response?.status === 409) {
                setErrorMessage('username or password is not valid.');
            } else {
                setErrorMessage('Unexpected error occurred');
            }
            setLoading(false);
        });
    }

    return (
        <div className="container mt-5">
            <div className="card ms-auto me-auto p-3 shadow-lg custom-card">
                <FontAwesomeIcon icon={faUserCircle} className="ms-auto me-auto user-icon"></FontAwesomeIcon>
                
                {errorMessage &&
                <div className="alert alert-danger">
                    {errorMessage}
                </div>
                }

            </div>
        </div>
    );
};



export {RegisterPage};