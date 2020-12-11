Simple Implementation  

From IntelliJ, run LibraryApplication  

[link to list books](http://localhost:8080/books)  

[link to list books with library book ids for book operations](localhost:8080/books/mappedToIds)  

[add new book](http://localhost:8080/books)  
POST json body - return book library id
<code>  
{  
      "title": "Hitchhiker's Guide to the Galaxy",  
      "authors": [ "Douglas Adams",  "Colfer", " Thomas Tidholm "],  
      "fakeISBN": "90089348-9504"  
}  
</code>

[update](http://localhost:8080/books/{id})  
PUT json body as above

[get/delete](http://localhost:8080/books/{id}) 
GET or DELETE by id
 
[patch](http://localhost:8080/books/{id})  
PATCH authors json body
<code>
{
   "authors": ["M", "N"]
}
</code>
