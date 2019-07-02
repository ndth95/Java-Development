package mainJava;

import java.util.ArrayList;
import java.util.Scanner;
import mainJava.Note;

public class mainJava {
	public static Scanner userScanner = new Scanner(System.in);
	public static ArrayList<Note> user_note_data = new ArrayList<Note>();
	public static Note userNote = new Note();
	
	public static void help_note() {
		System.out.println("Enter 1 to make new note");
		System.out.println("Enter 2 to insert a note content into your note");
		System.out.println("Enter 3 to change a note content");
		System.out.println("Enter 4 to start delete a note content");
		System.out.println("Enter 5 to print out the name of owner and note name");
		System.out.println("Enter 6 to print note content and info of note");
		System.out.println("Enter 7 to save all the work");
		System.out.println("Enter 0 to show help");
		System.out.println("Enter 10 to show all note obj");
		System.out.println("Enter 8 to stop using the program");
	}
	
	public static void create_new_note() {
		System.out.println("What is your name ???");
		String user_name = userScanner.nextLine();
		System.out.println("What is the note title ???");
		String note_title = userScanner.nextLine();
		userNote.setNote_owner(user_name);
		userNote.setNote_name(note_title);
	}
	
	public static void insert_note_content() {
		System.out.println("Please enter the note content at here: ");
		String note_content = userScanner.nextLine();
		userNote.add_new_note(note_content);
	}
	
	public static void delete_note() {
		userNote.print_all_note();
		System.out.println("How do you want to delete the note ???");
		int userChoice = userScanner.nextInt();
		userScanner.nextLine();
		if (userChoice == 1) {
			String note_content = userScanner.nextLine();
			userNote.delete_note_by_name(note_content);
		} else if (userChoice == 2) {
			int note_position = userScanner.nextInt();
			userNote.delete_note_by_position(note_position);
		} else {
			System.out.println("Command not found !!!");
		}
	}
	
	public static void change_note_content() {
		userNote.print_all_note();
		System.out.println("What is the position ???");
		int note_position = userScanner.nextInt();
		userScanner.nextLine();
		System.out.println("What is the new note ???");
		String new_note = userScanner.nextLine();
		userNote.edit_note(note_position, new_note);
	}
	
	public static void print_note_info() {
		userNote.print_note_info();
	}
	
	public static void print_all_note() {
		userNote.print_all_note();
	}
	
	public static void save_all() {
		user_note_data.add(userNote);
		System.out.println("DONE SAVING !!!");
	}
	
	public static void show_all_note_object() {
		for (int counter = 0; counter < user_note_data.size(); ++counter) {
			user_note_data.get(counter).print_all_note();
		}
	}
	
	public static void main(String[] args) {
		int userCommand = 0;		
		boolean quit = false;
		
		help_note();
		while (!quit) {
			System.out.println("Enter command");
			userCommand = userScanner.nextInt();
			userScanner.nextLine();
			
			switch (userCommand) {
			case 1:
				create_new_note();
				break;
			case 2:
				insert_note_content();
				break;
			case 3:
				change_note_content();
				break;
			case 4:
				delete_note();
				break;
			case 5:
				print_note_info();
				break;
			case 6:
				print_all_note();
				break;
			case 7:
				save_all();
				break;
			case 8:
				quit = true;
				break;
			case 10:
				show_all_note_object();
				break;
			case 0:
				help_note();
				break;
			}
		}
	}
}
















