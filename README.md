# External Integration with Team 1

## Contributing Guidelines

* It is good programming practice that commit messages that follow a standard. For our project, kindly use the standard given [here](https://gist.github.com/joshbuchea/6f47e86d2510bce28f8e7f42ae84c716)

* the ```src``` folder contains your source code in a hierarchical package structure.

* It is also good practice to never write code to the ```master``` branch directly.

* Code should be written in a per-feature basis. Every new feature should branch off of ```dev``` and when ready, make a Pull/Merge request to ```dev``` . The ```dev``` branch should then be merged with ```master``` when the code is stable enough

### Dependencies 
JARs should be placed in ``${PROJECT_ROOT}/ext/`` added to ``CLASSPATH`` while executing.

* [Java MySQL Driver](https://static.javatpoint.com/src/jdbc/mysql-connector.jar)

## Work Model 
The server ```sdd.team1.david.server.Server``` queries the clients ```sdd.team1.david.client.Client``` once per day at a pre-determined time of the day.

The client then replies back with the requested data.