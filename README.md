# Java Grade Submission Site

## Stack

- Java JDK 11
- Spring Boot v2.6.7

## Usage

Run the Spring Boot app and access at: `http://127.0.0.1:8080`
It has two pages:
- Form: You can submit new grades.
    - Name can't be blank.
    - Grade should be between 1 and 5.
    - Subject can't be blank.
- Grades: List of grades and update optionality.

The grades are stored in memory, this reload will erase them.
DEBUG is set to True, saving changes will automatically restart it.
