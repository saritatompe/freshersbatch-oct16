package collection;

import java.util.*;

public class ChatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<ChatRoom> chatRoomSet = new HashSet<>();
		Set<User> userSet = new HashSet<>();
		Map<Integer,Set> chatroomToUserMap = new HashMap<>(); 	
		int choice;
		Scanner in = new Scanner(System.in);
		do
		{
		System.out.println("Welcome to Chat Room");
		System.out.println(" Select your Option \n1.Create Chatroom");
		System.out.println("2.Add the User ");
		System.out.println("3.User Login ");
		System.out.println("4.Add message to group ");
		System.out.println("5.Display the messages from a specific chatroom");
		System.out.println("");
		choice= in.nextInt();
		in.nextLine();
		
		switch(choice){
		case 1 : 	System.out.println("Please enter the name of the  chatroom");
					String chat= in.nextLine().trim();
					ChatRoom newChatRoom = new ChatRoom(chat); 
					chatRoomSet.add(newChatRoom);
					break;
		case 2 : System.out.println("Please enter the name and password of the user");
				String user = in.nextLine().trim();
				
				String password = in.nextLine().trim();
				User newUser = new User(user,password);
				userSet.add(newUser);
				break;
		case 3 :System.out.println("Enter username and password");
				String uname= in.nextLine().trim();
				String pass= in.nextLine().trim();
				for(User currentUser:userSet)
				{
					if(currentUser.getUserName().equals(uname)&&currentUser.getPassword().equals(pass))
					{
						System.out.println("logged in successfully");
						System.out.println("Enter the chatroom :");
						String chatname= in.nextLine().trim();
						for(ChatRoom s:chatRoomSet)
						{
							if(s.chatroomName.equals(chatname))
							{
								System.out.println("Successfully logged in");
								break;
								
							}
							else
							{
							System.out.println("Not found");
							}
						}
					}
					
					
				}
			  
				break;
		case 4 :System.out.println("Enter the chatroom name :");	
				String chatname= in.nextLine().trim();
						for(ChatRoom s:chatRoomSet)
							{
								if(s.chatroomName.equals(chatname))
									{
										//System.out.println();
									System.out.println("Enter the message that u want to send :");
									String message_user=in.nextLine();
									s.addMessage(message_user);
								
				
										}
										else
										{
											System.out.println("Not found");
										}
								}
					
				break;
				
			
		case 5 :
				System.out.println("Enter the chatroom name :");	
				String chatname3= in.nextLine().trim();
				for(ChatRoom s:chatRoomSet)
				{
					if(s.getChatroomName().equals(chatname3))
					{
						for(ChatRoom s1:chatRoomSet)
						{
							System.out.println(s1.getMessages());
						}
					}
					else
					{
						System.out.println("chat room not thr");
					}
					
				}
	
				break;
			
	
			
		case 6 :
		
		
		}
		System.out.println(chatRoomSet);
		
	}while(true);
	}

}
class ChatRoom{
	
		int chatroomId;
		String chatroomName;
		List<String> messages ;
		public ChatRoom(String chatroomName) {
			this.chatroomName = chatroomName;
			this.chatroomId = new Random().nextInt(1000);
			messages= new ArrayList<>();
		}

		public String getMessages() {
			return messages.toString();
		}

		public void addMessage(String message) {
			messages.add(message);
		}

		public int getChatroomId() {
			return chatroomId;
		}
		
		@Override
		public int hashCode() {
			return chatroomId;
		}
		
		@Override
		public String toString() {
			return "ChatRoom [chatroomName=" + chatroomName + "]";
		}

		@Override
		public boolean equals(Object obj) {
			return this.chatroomId == ((ChatRoom)obj).getChatroomId();
		}
		

		public void setChatroomId(int chatroomId) {
			this.chatroomId = chatroomId;
		}
		public String getChatroomName() {
			return chatroomName;
		}
		
		public void setChatroomName(String chatroomName) {
			this.chatroomName = chatroomName;
		}
	
}


class User{
	
			private int userID;
			private String userName;
			private String password;
			@Override
			public int hashCode() {
				return userID;
			}
			@Override
			public String toString() {
				return "User [UserName=" + userName+ "]";
			}
			@Override
			public boolean equals(Object obj) {
				return this.userID== ((User)obj).getUserID();
			}
			public User(String userName, String password) {
				this.userID= new Random().nextInt(1000);
				this.userName = userName;
				this.password = password;
			}
			public int getUserID() {
				return userID;
			}
			public void setUserID(int userID) {
				this.userID = userID;
			}
			public String getUserName() {
				return userName;
			}
			public void setUserName(String userName) {
				this.userName = userName;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
		
	
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}