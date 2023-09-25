# Image Processing Application Documentation (Image filters)

## Overview
The Image Processing application is a Java program that allows users to perform various image manipulation tasks on a selected image file. It provides functionalities such as applying filters, converting to grayscale, zooming, and saving the modified image.  **`(m2husnainnaeem@gmail.com  feel free to contact for custom modification and other developments )`**

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Getting Started](#getting-started)
3. [Application Features](#application-features)
   - [File Chooser](#file-chooser)
   - [Load](#load)
   - [Filter #1](#filter-1)
   - [Filter #2](#filter-2)
   - [Filter #3](#filter-3)
   - [Gray Scale](#gray-scale)
   - [Zoom](#zoom)
   - [Save](#save)
4. [Filters Class](#filters-class)
5. [Usage](#usage)
6. [Contributing](#contributing)
7. [License](#license)

## Prerequisites
- Java Development Kit (JDK) installed on your system.

## Getting Started
1. Clone or download the repository containing the Java files.
2. Compile and run the `ImageProcessing.java` file to launch the application.

## Application Features

### File Chooser
- Opens a file dialog to select an image file (supports JPG, JPEG, and PNG formats).
- Displays the selected image in the input panel.

### Load
- Allows users to load an image file using the "LOAD" button.
- Displays the selected image in the input panel.

### Filter #1
- Applies a filter that swaps the red and blue color channels of the image.
- Displays the filtered image in the output panel.

### Filter #2
- Applies a filter that swaps the red and green color channels of the image.
- Displays the filtered image in the output panel.

### Filter #3
- Applies a filter that swaps the red and blue color channels and green and blue color channels of the image.
- Displays the filtered image in the output panel.

### Gray Scale
- Converts the image to grayscale.
- Displays the grayscale image in the output panel.

### Zoom
- Prompts the user to enter a zoom factor.
- Zooms the image by duplicating pixels based on the zoom factor.
- Displays the zoomed image in the output panel.

### Save
- Allows users to save the currently displayed image in JPG format using the "SAVE" button.

## Filters Class
The `Filters` class contains static methods for applying various image filters and transformations.

### filter1
- Swaps the red and blue color channels of the input image.
- Returns the filtered image.

### filter2
- Swaps the red and green color channels of the input image.
- Returns the filtered image.

### filter3
- Swaps the red and blue color channels and green and blue color channels of the input image.
- Returns the filtered image.

### grayScale
- Converts the input image to grayscale.
- Returns the grayscale image.

### zoomImage
- Zooms the input image by a specified zoom factor.
- Returns the zoomed image.

## Usage
1. Launch the application.
2. Use the "File Chooser" or "Load" button to select an image.
3. Apply various filters and transformations using the provided buttons.
4. Save the modified image using the "SAVE" button.

## Contributing
Contributions are welcome. If you want to contribute to this project, please fork the repository and create a pull request.

## License
This project is licensed under the [MIT License](LICENSE).
