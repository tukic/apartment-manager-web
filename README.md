# apartment-manager-web


<h2>What is it?</h2>

Web application for tracking and managing apartment reservations.


<h2>Web resources</h2>

| resource            | description                                       |
| ------------------- |:--------------------------------------------------| 
| /reserved-dates     | reservations shown in calendar view month by month| 
| /reservations       | reservatios shown in list view                    |
| /reservations/{id}  | reservation details                               |
| /login              | login page                                        |
| /apartments         | apartments shown in list view                     |
| /apartments/{id}    | apartment details                                 |
| /reservations/new   | form for adding new reservation                   |


<h2>Authentication</h2>

Resources matching ant patterns "/reservations*" and "/reservations/*" are accessable only by authorised users with permission to access those resources.


<h2>Screenshots</h2>

Screenshots of available pages.

<p>
    <img src="screenshots/Calendar view.PNG" alt>
    <em>/reserved-dates</em>
</p>

<p>
    <img src="screenshots/Login.PNG" alt>
    <em>/login</em>
</p>

<p>
    <img src="screenshots/Reservations.PNG" alt>
    <em>/reservations</em>
</p>

<p>
    <img src="screenshots/Reservation.png" alt>
    <em>/reservations/{id}</em>
</p>

<p>
    <img src="screenshots/Apartment list.PNG" alt>
    <em>/apartments</em>
</p>

<p>
    <img src="screenshots/Apartment.PNG" alt>
    <em>/apartments/{id}</em>
</p>


<h2>API documentation</h2>

| resource           | description                 |
| ------------------ |:----------------------------| 
| /all-reservations  | reservations in JSON format | 
| /all-apartments    | apartments in JSON format   |



