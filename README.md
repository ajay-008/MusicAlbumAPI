API:1 End point URL (API to create/update music album records)
Create==>  localhost:8383/music
Update ==> localhost:8383/updatemusic
FetchAll ==> localhost:8383/

------------------------------------------------------------
API:2 End point URL (API to create/update musician records)
Create==>  localhost:8383/setMusician
Update ==> localhost:8383/updatemusician
FetchAll ==> localhost:8383/fetchMusician
--------------------------------------------------------------

API:4 API to retrieve the list of Music albums for a specified musician sorted by Price in
ascending order (i.e Lowest first)

localhost:8383/fetchAllSortedByPrice/101
----------------------------------------------------------------

API:5 Test case-
Garmi,Coca Cola albums are sung by 3 Musicians =>Tulsi Kumar,Bhusan Kumar,Sonu Nigam
localhost:8383/fetchAllSortedByMusicianName/102/Garmi

----------------------------------------------------------------------------------





{
	
	"album_ID": 102,
	"album_Name": "Garmi",
	"date_of_release": "01/Dec/2020",
	"genre": "POP",
	"price": 200,
	"description": "Sung by Badshah"

}

{
	
	"album_ID": 102,
	"album_Name": "Coka Cola",
	"date_of_release": "01/Mar/2020",
	"genre": "Classical",
	"price": 400,
	"description": "Sung by Badshah"

}

{
	"album_ID": 101,
	"album_Name": "Taaroon Ka Sahar",
	"date_of_release": "01/Oct/2020",
	"genre": "Rock",
	"price": 700,
	"description": "Sung by Neha Kakkar"

}

{
	"album_ID": 101,
	"album_Name": "O Saki Saki",
	"date_of_release": "01/Nov/2020",
	"genre": "Hip Hop",
	"price": 500,
	"description": "Sung by Neha Kakkar"

}

--------For Musican----------

{
	
	"album_ID": 101,
	"musicians_Name": "Neha Kakkar",
	"musicians_Type": "Vocalist"
	

}

{
	
	"album_ID": 102,
	"musicians_Name": "Tulsi Kumar",
	"musicians_Type": "Vocalist"
	

}

{
	
	"album_ID": 103,
	"musicians_Name": "Badshah",
	"musicians_Type": "Instrumentalist"
	

}


------------------------------------
Database level-

Music Albums:
- Album name (Mandatory, Should be minimum 5 characters)
- Date of release (Mandatory)
- Genre (i.e., Type of music)
- Price (Mandatory, value between 100 to 1000)
- Description

Table  Name - MUSIC_ALBUM
Primary Key --> Album Id

1)Taaroon Ka Sahar,01-Oct-2020,Rock,700,Sung by Neha Kakkar ==> Album Id 101
2)O Saki Saki,01-Nov-2020,Hip Hop Music,500,Sung by Neha Kakkar ==> Album Id 101
3)Garmi,01-Dec-2020,PoP Music,200,Sung by Badshah ==> Album Id 102
4)Teri Aankhon Mein,01-Jan-2021,Soul Music,600,Sung by Tulsi Kumar ==> Album Id 103
5)Dilbar,01-Feb-2021,Folk Music,300,Sung by Tulsi Kumar ==> Album Id 103
6)Coka Cola,01-Mar-2021,Classical Music,400,Sung by Badshah ==> Album Id 102



--------------------------------
Musicians:

- Name (Mandatory, Should be minimum 3 characters)
- Musician type (Vocalist, Instrumentalist, etc...)


Table  Name - MUSICIAN
Foreign Key --> Album Id

1)Neha Kakkar,Vocalist ==> Album Id 101
2)Tulsi Kumar,Vocalist ==> Album Id 103
3)Badshah,Instrumentalist ==> Album Id 102
--------------------------------------------------------


