
# TuneBlendr Project API

The music platform API is a backend API built using Java Spring, Spring Web, and Dev Tools. The API provides a simple backend for a music platform, allowing for CRUD operations on songs and artists. The API has endpoints for retrieving a list of all songs or artists, retrieving a specific song or artist by ID, creating a new song or artist, updating a specific song or artist by ID, and deleting a specific song or artist by ID.

The API can be easily tested using Postman or any other HTTP client that supports sending JSON requests. The API accepts requests in JSON format and returns responses in JSON format as well.

This API provides a foundation for building a more complex music platform, allowing for the creation and management of songs and artists. It can be extended to include additional functionality, such as user authentication and authorization, playlists, and more.

## Diagram ( v1.0 )

![alt text](https://github.com/medeirosdev/API-MusicBlender-Java/blob/master/tumblr.png)
Não está pronto ainda

## Running the API

To run the API, you will need Java 8 or higher installed on your machine. Once Java is installed, follow these steps:

    Clone the repository to your local machine.
    Open the project in your preferred IDE.
    Build the project using the provided build script.
    Run the project using the provided run script.
    The API will be accessible at http://localhost:8080/





# Endpoints

## App Routes
- GET/app/feed
- POST/app/like/{id}
- POST/app/comment/{id}
- POST/app/createComment/{id}
- GET/app/getComments/{MusicId}

## Log
- GET/log/all

## Music Routes
- POST/music/create/{userId}
- DELETE/music/delete/{id}
- GET/music/findMusicBy/{id}
- POST/music/update/{id}

## UserCredentials Routes
- POST/user/create
- GET/user/findUser
- DELETE/user/delete
- POST/user/update

## UserInfo Routes
- POST/user/createInfo/{userId}

## Music MarketPlace
- POST/product/create/{userid}
- GET/product/MarketFeed
- DELETE/product/delete/{id}

## Auth Routes
- GET/auth/login
- POST/auth/register

## Forum Routes
- POST/forum/create/{userId}
- POST/message/{forumId}/{userId}
- GET/forum/showMessages


## Testing the API

To test the API, you can use Postman or any other HTTP client that supports sending JSON requests. You can use the provided documentation to see the available endpoints and their parameters.

## Conclusion

This API provides a simple backend for a music platform. It is built using Java Spring, and allows for CRUD operations on songs and artists. It can be easily extended to add additional functionality as needed.
