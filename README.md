# Example Project with Play Swagger Issue

This project illustrates an issue in which, as per the current project configuration, the multi-module sbt project does not allow the Swagger Plugin to detect and process case classes defined in a dependency module other than the Play Framework one.

The `routes` file has two test endpoints. One which refers to a case class in the Play module `api`, and which is correctly detected and processed, and another one which is defined in the `common` module and which, when uncommented in the routes file, results in an error.

