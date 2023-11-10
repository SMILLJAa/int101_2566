
package work02;

//    3.1. Make this class a public class. 
public class FriendList {
//    3.2. Create a private final friend field of type String. 
//    3.3. Create a private next field of type FriendList
    private final String friend;
    private FriendList next;
//3.4. Create a private constructor that receives a friend parameter (String) to set the friend field. 
    public FriendList(String friend) {
        this.friend = friend;
    }
//3.5. Create a public static newList method that receives no parameters but returns a newly-created FriendList with an empty string as its friend.     
    public static FriendList newList(){
        return new FriendList("");
    }
/* 3.6. Create a public addFriend method that receives a friend parameter (String) and returns a boolean. 
    This method returns false if the friend parameter is null or a blank string or equals to any friend field of any 
    FriendList in the next chained list. Otherwise, it creates a new FriendList object with the friend field equals to the friend parameter 
    and put this newly-created FriendList object as the next field of the last FriendList in the chained list.     */
    public boolean addFriend(String friend){
        if(friend == null || friend.isBlank()) return false;
        FriendList current = this;
        while (current.next != null){
            current = current.next;
            if(current.friend.equals(friend)) return false;
        }
        current.next = new FriendList(friend);
        return true;
    }
    /*3.7. Create an overriding public toString method that receives no parameters and returns a String containing  
            the values of all the friend fields of all FriendList object in the chained list separated by commas (“, ”).  
            Use StringBuilder to build the output String. Return an empty string if there are no friends on the list. */
    @Override
    public String toString(){
        var current = this.next;
        if(current == null) return "";
        var s = new StringBuilder();
        s.append(current.friend);
        while((current=current.next) != null){
            s.append(", ").append(current.friend);
        }
        return s.toString();
    }
    
}
