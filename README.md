sohn

# Structure

<a name="TOP"></a>

## Data-classes

* The class "Raum" holds an integer number for the number of the room you want to select and the Timeslot holds the possible timeslots which will in the near future be mapped to one-another
* The class "Timeslot" defines 8 possible timeslots for the rooms to be booked within

## Classes

* "Veranstaltung" creates a new event that holds name, date, room, capacity and the timeslot of the event.
* The Main class initializes a List which will hold all room-numbers you can choose from. It utilizes the "Raum"-datatype which is briefly explained in the [Data-classes](#TOP)-section


## Methods

* getRooms() returns rooms 
* addRoom() adds a element to the "rooms" List. the other methods do as the names describe

