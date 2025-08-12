# Raspberry Pi Chat (Java)

A simple Java-based chat application designed for Raspberry Pi, enabling real-time messaging over a local network. This project demonstrates core networking concepts in Java and is ideal for learning, tinkering, or building lightweight chat systems on Raspberry Pi devices.

## Context

While working and developing on my personal raspberry pi, I noticed the built in browser (Chromium), had trouble loading sites that I often visit for programming resouces (stackoverflow, git repos, documentation, and especially chatgpt). This made it difficult to find code examples and paste them directly into my IDE on the raspberry pi. I developed this application to assist with this issue. 

Using my personal mac, I am able to utilize chatgpt and other sites to get code snippets and examples, and paste them directly in the chat application to then copy the contents on my raspberry pi.

## Demo

Simply run the application on your personal development machine (running application steps below), open up this link in your raspberry pi (http://{your development machine's IP address}:8080), and send messages, files, and screenshots back and forth!

To send code snippets and retain code format, send the code block in inside 3 opening and closing back tick (```) statement 

Here is an example of how it works:


Mac -
<img width="1716" height="1634" alt="image" src="https://github.com/user-attachments/assets/4046edef-8667-4189-b443-6ca370517b36" />


Raspberry PI -

<img width="320" height="240" alt="image" src="https://github.com/user-attachments/assets/aaf5e162-ec50-4329-88c4-2d9b9577fd54" />


Mac -
<img width="1700" height="1618" alt="image" src="https://github.com/user-attachments/assets/ba602339-2518-4f48-987f-fb0f18f85ece" />
And click send


Raspberry PI -

<img width="320" height="240" alt="image" src="https://github.com/user-attachments/assets/84bee11b-b763-4062-a771-f5fc20c59552" />

You can upload files and send screenshots as well using the Upload File feature 
(Note: create an uploads folder in the root directory for this to work as it isn't tracked by git)

<img width="924" height="1010" alt="image" src="https://github.com/user-attachments/assets/42a8f8f0-5178-442f-8f1a-8721504209ce" />


Mac -
<img width="1728" height="1636" alt="image" src="https://github.com/user-attachments/assets/90595330-d10e-47b8-a8fc-ce8bc1bf10c7" />


Raspberry Pi -

<img width="320" height="240" alt="image" src="https://github.com/user-attachments/assets/dff5a870-a24a-4c52-a9cb-a50e6a231dac" />


## Features

- Peer-to-peer messaging between devices on the same network
- Simple user interface for sending and receiving messages
- Easy setup and deployment on Raspberry Pi (or any Java-enabled device)

## Prerequisites

- Java Development Kit (JDK) 23 or later
- Gradle gradle-8.12.1 or later
- A Raspberry Pi (any model with Java support) or any computer with Java installed
- A local network connection for all devices involved

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/chasedickerson/raspberry-pi-chat-java.git
   cd raspberry-pi-chat-java
   ```

2. **Compile the source code on development device:**
   ```./gradlew build``` or ```gradlew build```

3. **Run the server:**
   ```./gradlew run```

4. **Run the client(s):**
   go to ```http://localhost:8080``` on development device
   determine your development devices's IP Address
   on your raspberry pi go to ```http://{ip-address}:8080```

6. **Start chatting!**
   - Enter messages in the client window to communicate with raspberry pi.

## Project Structure

```
raspberry-pi-chat-java/
├── src/main/java/com.rpi.chat     # Java source files (Client.java, Server.java, etc.)
├── src/resources/templates        # Simple HTML page for the UI
├── bin/                           # Compiled Java classes
├── README.md                      # Project documentation
```

## Python Source Code

https://github.com/chasedickerson/raspberry-pi-chat-python

Java/Gradle can be difficult to setup locally if not already done so here is a python version of the code that works the same way


## License

This project is open source and available under the [MIT License](LICENSE).

## Author

- [Chase Dickerson](https://github.com/chasedickerson)

---

*Happy chatting on your Raspberry Pi!*
