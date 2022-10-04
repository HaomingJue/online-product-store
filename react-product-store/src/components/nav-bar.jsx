import logo from '../logo.svg';

const NavBar = () => {
    return (
        <nav className="navbar navbar-expand navbar-dark bg-dark">
            <a href="https://reactjs.org" className="navbar-brand ms-1">
                <img src={logo} className="App-logo" alt="logo" />
                React
            </a>

            <div className="navbar-nav me-auto">
                <li className="nav-item">
                    <a href="" className="nav-link">
                        Admin
                    </a>
                </li>
                <li className="nav-item">
                    <a href="" className="nav-link">
                        Home
                    </a>
                </li>
            </div>
            <div className="navbar-nav ms-auto">
                <li className="nav-item">
                    <a href="" className="nav-link">
                        Sign Up
                    </a>
                </li>
                <li className="nav-item">
                    <a href="" className="nav-link">
                        Sign in
                    </a>
                </li>
            </div>
        </nav>
    );
};

export {NavBar};