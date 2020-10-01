import React, { Component } from 'react';
import {Route, BrowserRouter as Router, Switch} from 'react-router-dom';
import Apartment from './Apartment';


class App extends Component {
	state = { }
	render() {
		return ( 
			<Router>
				<Switch>
					<Route path='/demo-react/apartments' exact={true} component={Apartment}/> 
				</Switch>
			</Router>
		);
	}
}

export default App;
