package filehandling

import scala.io.Source  // To read files
import java.io.{File, PrintWriter, BufferedWriter, FileWriter}  // To write and append files

object FileHandling {

  /*
  Write Files: Uses PrintWriter to write text to a file. Closing the writer ensures data is written.
  Read Files: Uses Source to read files line by line, printing each line to the console.
  Append Files: Uses BufferedWriter and FileWriter in append mode to add content to an existing file.
  Check File Existence: Uses exists() method from the File class to check if a file exists.
  Delete Files: Uses delete() from the File class to remove a file from the filesystem.
   */


  // Writing to a file
  def writeFile(): Unit = {
    // PrintWriter class is used to write data to a file.
    // If the file doesn't exist, it will create a new file, otherwise, it will overwrite the existing one.
    val writer = new PrintWriter(new File("output.txt"))  // Creates a PrintWriter for "output.txt"

    // Writing data to the file
    writer.write("Hello, this is a test file.\n")  // Writing first line of text
    writer.write("Scala file handling is easy to use.\n")  // Writing second line of text

    // Always close the PrintWriter to release resources and save the data to the file.
    writer.close()
    println("File 'output.txt' has been written.")  // Confirmation message
  }

  // Reading from a file
  def readFile(): Unit = {
    // The Source class provides methods to read data from a file.
    // Source.fromFile() returns a Source object that reads the file.
    println("\n--- Reading File ---")  // Section header for clarity
    val source = Source.fromFile("output.txt")  // Opens the file "output.txt" for reading

    // Looping through each line of the file and printing it
    for (line <- source.getLines()) {  // getLines() gives an iterator over lines
      println(line)  // Printing each line
    }

    // Always close the Source after reading to free resources.
    source.close()
  }

  // Appending to a file
  def appendFile(): Unit = {
    // To append content to an existing file, use FileWriter with the second parameter as "true" (append mode).
    // BufferedWriter is used to improve writing efficiency.
    val fileWriter = new FileWriter("output.txt", true)  // Open file in append mode
    val bufferedWriter = new BufferedWriter(fileWriter)  // BufferedWriter wraps FileWriter for better performance

    // Appending data to the file
    bufferedWriter.write("Appending new content to the file.\n")  // Adds a new line to the file

    // Always close BufferedWriter and FileWriter to apply changes and release resources.
    bufferedWriter.close()
    println("\nContent has been appended to 'output.txt'.")  // Confirmation message
  }

  // Checking if a file exists
  def checkFileExists(): Unit = {
    // File class is used to handle file metadata and operations like checking existence.
    println("\n--- Check File Exists ---")  // Section header
    val file = new File("output.txt")  // Create a File object to represent "output.txt"

    // Check if the file exists using the exists() method of the File class.
    if (file.exists()) {
      println(s"File '${file.getName}' exists.")  // If true, file exists
    } else {
      println(s"File '${file.getName}' does not exist.")  // If false, file doesn't exist
    }
  }

  // Deleting a file
  def deleteFile(): Unit = {
    // The delete() method of the File class is used to delete a file from the filesystem.
    println("\n--- Deleting File ---")  // Section header
    val file = new File("output.txt")  // Create a File object to represent "output.txt"

    // Check if the file was successfully deleted using the delete() method.
    if (file.delete()) {
      println(s"File '${file.getName}' has been deleted.")  // File deletion success message
    } else {
      println(s"File '${file.getName}' could not be deleted.")  // If deletion fails, print an error message
    }
  }

  // Main function to execute all file handling operations
  def main(args: Array[String]): Unit = {
    // Calling each function to demonstrate file operations
    writeFile()  // Write data to a file (creates/overwrites the file)
    readFile()  // Read and display the contents of the file
    appendFile()  // Append additional data to the file
    checkFileExists()  // Check if the file exists
    deleteFile()  // Delete the file from the system
  }
}
