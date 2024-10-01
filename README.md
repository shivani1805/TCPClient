### _**How to run the client program**_
* Open the project in IntelliJ IDE.
* Setup SDK to Java 11. Go to File > Project Structure > Modules > Dependencies. Set Module SDK to OpenJDK version 11. Other versions may also be used.
* Right click on TCPClient.java file and run TCPClient.main()
* Once the program runs, it will prompt the user to enter the IP address on which the server is running. Either enter the remote IP or enter 'localhost' if the server is running locally on your machine.
* The program will then prompt the user to enter the port number on which the server is running, for example port 1524. 
* If the IP/localhost and port number entered are correct, a connection will be established between client and server.
* If connection is refused please check if the IP and port are correct and if the server is running.
* Then enter the text you want to reverse with length upto 80 characters. 
* TCP Client will exit once response is received from the server.
