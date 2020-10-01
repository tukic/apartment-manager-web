import React, { Component } from 'react';

class Apartment extends Component {
	state = {
		isLoading: true,
		Apartments: []
	}

	async componentDidMount() {
		const response = await fetch('/demo/all-apartments');
		const body = await response.json();
		this.setState({ Apartments: body, isLoading: false });
	}

	render() {
		const { Apartments, isLoading } = this.state;
		if (isLoading) return (<div>Loading...</div>);

		return (
			<div>
				<h2>
					Apartment
                </h2>
				{
					Apartments.map(apartment =>
						<div id={apartment.apartmentId}>
							{apartment.apartmentName}
						</div>
					)
				}
			</div>
		);
	}
}

export default Apartment;