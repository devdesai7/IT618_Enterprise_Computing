# IT618_Enterprise_Computing
College Work 

Lab Assignment#2
Menu.jsp : Main file which includes the hyperlink of every action which performed by the user
AddCandidate.jsp : Following file inclues a form , where candidates can enroll themselfs 
PollServlet.java : It includes the presentation layer , where all what to do , when any action is clicked is mentioned. It's recieves and sends data through object created from Business layer i.e is Poll.java
Poll.Java : It includes Business logic of the Polling , i.e getCandidate(),setCandidate(),setVote(),getWinner(),getWinner2()(The one who was close enough),getCname()(Storing Data of the voter)
Candidate.java : It includes Candidate's data which is been shared to Poll.java , i.e getName() (we have used HashMap for key value pair),setName(),setVote(),getVoteCount(),getCandiateCount(),sortedData().
