1. League App (Backend)
2. Input
Enter **SumName** 
	return solo, flex, tft rank 
	return previous years ranks(graph)
	return previous champion stats 
	return winrates current and previous season 
	return match history 	
3. Information 

	method **match history**
	
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
	    current Main File
	
	
	
4. Output

    gives Information --> json 
    
**Frontend will receive a Json with the required Information**

**Technology** 

    Java Backend
    React Frontend
    
**React**
`https://www.robinwieruch.de/react-hooks-fetch-data`
`https://medium.com/@Zwenza/functional-vs-class-components-in-react-231e3fbd7108`