package Friends;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/friends")
public class FriendsController {
	
	FriendsCollectionService friendsCollectionService = new FriendsCollectionService();
	
	//CRUD for friends
	
	//get the list of all friends
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List getAllFriends(){
		System.out.println("hi");
		List allfriends = friendsCollectionService.getAllFriends();		
//		
//		for (int i = 0; i < allfriends.size(); i++) {
//			Friend f = (Friend) allfriends.get(i);
//			System.out.println(f.id);
//		}
		return allfriends;
	}
	
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Friend getFriendById(@PathParam("id") int idToSearch) {
		Friend searchedfrnd= friendsCollectionService.getFriendById(idToSearch);
		return searchedfrnd;

	} 
	
	//update the friend
	public void updateFriend(){
		
	}
	
	//delete the friend
	public void deleteFriend(){
		
	}

}
