1. League App (Backend)
Input

Enter SumName 
	return solo, flex, tft rank 
	return previous years ranks(graph)
	return previous champion stats 
	return winrates current and previous season 
	return match history 
	
Information 
	method match history
		return past 20 games set in Json Structure
			your champ
			your score  + cs 
			win or loss
	method rank 
		return rank in json field
			solo
			flex
			tft
	method champdata (input season)
		champions in current season
		champion winrate
	method sumInfo
	
	
	
Output
gives Information --> json 

read the json file in the Frontend 



Technology 
Java Backend
React Frontend