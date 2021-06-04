package OOP_TCS;

import java.io.*;
import java.util.*;

public class Solution 
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Contest[] contest = new Contest[4];
		
		for(int i = 0; i < contest.length; i++)
		{
			int contestId = Integer.parseInt(br.readLine());
			String contestName = br.readLine();
			String contestWinner = br.readLine();
			int points = Integer.parseInt(br.readLine());
			String category = br.readLine();
			
			contest[i] = new Contest(contestId, contestName, contestWinner, points, category);
		}
		
		String winner = br.readLine();
		String givenCategory = br.readLine();
		
		int total_points = findTotalPointsBasedOnWinner(contest, winner);
		if(total_points > 0)
			System.out.println(total_points);
		else
			System.out.println("Contest Winner not found");
		
		Contest []ans = getContestWithSecondHighestPoints(contest, givenCategory);
		if(ans != null) {
			System.out.println(ans[1].getContestName() + " \n" + ans[1].getPoints());
		}
		else
			System.out.println("There is no matching contest");
	}
	
	public static int findTotalPointsBasedOnWinner(Contest[] contest, String winner)
	{
		int total = 0, c = 0;
		
		for(int i = 0; i < contest.length; i++)
		{
			if(contest[i].getContestWinner().equalsIgnoreCase(winner)) {
				total += contest[i].getPoints();
				c++;
			}
		}
		if(c > 0)
			return total;
		else
			return 0;
	}
	
	public static Contest[] getContestWithSecondHighestPoints(Contest[] contest, String givenC)
	{
		int c = 0;
		Contest[] temp = null;
		
		for(int i = 0; i < contest.length; i++)
		{
			if(contest[i].getCategory().equalsIgnoreCase(givenC)) {
				c++;
			}
		}
		
		temp = new Contest[c];
		c = 0;
		
		for(int i = 0; i < contest.length; i++)
		{
			if(contest[i].getCategory().equalsIgnoreCase(givenC)) {
				temp[c] = contest[i];
				c++;
			}
		}
		
		for(int i = 0; i < c-1; i++)
		{
			for(int k = i+1; k < c-1; k++)
			{
				if(temp[k].getPoints() > temp[i].getPoints())
				{
					Contest con = temp[k];
					temp[k] = temp[i];
					temp[i] = con;
				}
			}
		}
		return temp;
	}
}

class Contest
{
	private int contestId;
	private String contestName;
	private String contestWinner;
	private int points;
	private String category;
	
	
	public Contest(int contestId, String contestName, String contestWinner, int points, String category) {
		super();
		this.contestId = contestId;
		this.contestName = contestName;
		this.contestWinner = contestWinner;
		this.points = points;
		this.category = category;
	}
	public int getContestId() {
		return contestId;
	}
	public void setContestId(int contestId) {
		this.contestId = contestId;
	}
	public String getContestName() {
		return contestName;
	}
	public void setContestName(String contestName) {
		this.contestName = contestName;
	}
	public String getContestWinner() {
		return contestWinner;
	}
	public void setContestWinner(String contestWinner) {
		this.contestWinner = contestWinner;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}