package mainJava;

import java.util.ArrayList;

public class Note {
	private String note_owner;
	private String note_name;
	private ArrayList<String> note_content = new ArrayList<String>();
	
	public Note() {
		
	}
	
	public Note(String note_owner, String note_name) {
		this.note_owner = note_owner;
		this.note_name = note_name;
	}
	
	public boolean search_for_note(String user_note) {
		// true means not found anything
		if (this.note_content.indexOf(user_note) == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void add_new_note(String new_note) {
		if (search_for_note(new_note) == true) {
			this.note_content.add(new_note);
		} else {
			System.out.println("This note is already added !!!");
		}
	}
	
	public void delete_note_by_position(int note_index) {
		this.note_content.remove(note_index);
		System.out.println("Note at position " + note_index + " has been removed !!!");
	}
	
	public void delete_note_by_name(String note_content) {
		int note_index = this.note_content.indexOf(note_content);
		if (note_index >= 0) {
			this.note_content.remove(note_index);
			System.out.println("Note at position " + note_index + " has been removed !!!");
		} else {
			System.out.println("Not found any note like that !!!");
		}
	}
	
	public void edit_note(int note_position, String new_note) {
		this.note_content.set(note_position, new_note);
		System.out.println("Note at position " + note_position + " has been changed !!!");
	}
	
	public void print_note_info() {
		System.out.println("Note owner: " + this.note_owner);
		System.out.println("Note name: " + this.note_name);
	}
	
	public void print_all_note() {
		print_note_info();
		for (int counter = 0; counter < this.note_content.size(); ++counter) {
			System.out.println("Note number " + counter + ": " + this.note_content.get(counter));
		}
		System.out.println("");
	}

	public String getNote_owner() {
		return note_owner;
	}

	public void setNote_owner(String note_owner) {
		this.note_owner = note_owner;
	}

	public String getNote_name() {
		return note_name;
	}

	public void setNote_name(String note_name) {
		this.note_name = note_name;
	}

	public ArrayList<String> getNote_content() {
		return note_content;
	}

	public void setNote_content(ArrayList<String> note_content) {
		this.note_content = note_content;
	}
}
