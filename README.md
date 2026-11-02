# Print Job Management System

A Java Swing desktop application for managing print requests. The system
allows users to submit print jobs, view the job queue, search for a job
by its ID, and process jobs from the queue.

This project was developed for the **IT20: Data Structures and
Algorithms** Java GUI Midterm Mini-Project at the Institute for Computer
Studies.

## Features

- **Submit print jobs** --- Create a print job by selecting a printer,
  paper size, number of copies, page selection, color mode, and
  printing sides.
- **Input validation** --- Check required selections and numeric
  inputs before a job is added.
- **View print jobs** --- Display submitted jobs in a table in the
  main application window.
- **Search by job ID** --- Find a specific print job using a manually
  implemented Linear Search.
- **Process a specific job** --- Search for a job and process it,
  removing it from the queue.
- **Process the next job** --- Process the first job in the queue,
  following the First In, First Out principle.
- **Queue management** --- Add, search, and remove print jobs using a
  manually implemented array.

## Data Structure and Searching

The project uses a manually implemented array to store print job
objects. It does not use Java Collection classes.

- **Array:** Stores print jobs.
- **Linear Search:** Checks jobs one by one until the requested job ID
  is found.
- **FIFO processing:** The next-job operation processes the earliest
  job in the queue first. After a job is processed, the remaining
  array elements are shifted to keep the queue in order.

## Setup and Installation

### Requirements

- Java Development Kit (JDK)
- Apache NetBeans IDE
- The project source code

### Open and run the project

1.  Clone or download the shared GitHub repository.
2.  Open Apache NetBeans.
3.  Select **File → Open Project**.
4.  Browse to the downloaded project folder and open it.
5.  Allow NetBeans to load and resolve the project.
6.  Locate the main JFrame class, `Printjob.java`.
7.  Run the project from NetBeans. The main window should open.

## How to Use

1.  Open the application.
2.  In the main window, choose the printer and paper size.
3.  Enter the number of copies.
4.  Choose **All** pages or enter a custom page count.
5.  Select the color mode and printing sides.
6.  Submit the job. A valid job should appear in the jobs table.
7.  Use the Find/Search control to open the ID Search window.
8.  Enter a job ID and search for it. The Process button becomes
    available when a matching job is found.
9.  Select **Process** to remove that specific job.
10. Use **Process Next Job** in the main window to process the first job
    in the queue.

## Project Structure

---

File Responsibility

---

`PrintJobClass.java` Defines a print job and its
attributes, with a constructor and
getter methods.

`PrintJobManager.java` Manages the array of print jobs,
including adding, searching,
deleting, and processing jobs.

`Printjob.java` Main application window for
submitting and viewing print jobs,
and processing the next job.

`IdSearch.java` Secondary window for searching for
a job by ID and processing the
selected job.

---

## Team Roles and Contributions

This project was developed collaboratively by **Tampico** and
**Dugo-An**.

### Tampico

- Planned the application's overall architecture and interface.
- Developed the main window interface.
- Implemented the display of submitted print jobs in the main window's
  table.
- Created the foundational classes for representing and managing print
  jobs for use by the application's operations.
- Prepared the project README.

### Dugo-An

- Developed the second window interface (`IdSearch`).
- Improved the print-job classes and manager operations to support
  processing jobs.
- Implemented the functionality for processing a specific job and
  removing it from the queue.
- Helped make the print jobs manageable through the application's
  queue operations.

### Collaboration

Both team members contributed to building the working Java Swing
application. The project combines the user interface, manually
implemented data structure, searching algorithm, and print-job
processing operations.

## Technologies

- Java
- Java Swing (`JFrame`, `JOptionPane`, `JTable`)
- Apache NetBeans IDE
- Arrays and object-oriented programming
