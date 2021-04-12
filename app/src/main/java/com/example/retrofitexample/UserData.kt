package com.example.retrofitexample

import com.google.gson.annotations.SerializedName

data class UserData(
        val results: List<User>
)

data class User(
        val gender: String,
        val name: Names,
        val email: String,
        // If you want to give a different variable name (different than what is in the received data),
        // you need to use @SerializedName, otherwise you can simply give the same variable name
        @SerializedName("picture") val imageUrl: Picture
)

data class Names(
        val title: String,
        val first: String,
        val last: String
)

data class Picture(
        val medium: String
)


// Copied and pasted a sample response below to make it easier to write data class above
/*

{
    "results": [
    {
        "gender": "female",
        "name": {
        "title": "Ms",
        "first": "Juanita",
        "last": "Williams"
    },
        "location": {
        "street": {
        "number": 1924,
        "name": "Paddock Way"
    },
        "city": "Nampa",
        "state": "North Carolina",
        "country": "United States",
        "postcode": 41272,
        "coordinates": {
        "latitude": "66.0758",
        "longitude": "9.0306"
    },
        "timezone": {
        "offset": "+2:00",
        "description": "Kaliningrad, South Africa"
    }
    },
        "email": "juanita.williams@example.com",
        "login": {
        "uuid": "7ff8399a-58b3-4615-b48e-bfc0839945a6",
        "username": "tinypanda945",
        "password": "lalakers",
        "salt": "ITnBfuDr",
        "md5": "944f1cf5866111a21ffe9934488d2d3c",
        "sha1": "d63a3b522019b820d5eb2c72659281ed64a2df02",
        "sha256": "a4b2410f3a3148e81a0d3b484cf57f96fdec01af6464ace382dd6d71b8941973"
    },
        "dob": {
        "date": "1988-05-23T05:22:05.322Z",
        "age": 32
    },
        "registered": {
        "date": "2002-09-11T00:09:47.839Z",
        "age": 18
    },
        "phone": "(155)-236-4175",
        "cell": "(699)-609-0744",
        "id": {
        "name": "SSN",
        "value": "884-33-4596"
    },
        "picture": {
        "large": "https://randomuser.me/api/portraits/women/54.jpg",
        "medium": "https://randomuser.me/api/portraits/med/women/54.jpg",
        "thumbnail": "https://randomuser.me/api/portraits/thumb/women/54.jpg"
    },
        "nat": "US"
    }
    ],
    "info": {
    "seed": "495f1a72d6bc8975",
    "results": 1,
    "page": 1,
    "version": "1.3"
}
}*/






// Copied and pasted a sample response below to make it easier to write data class above

/*
// Multiple  users
{"results":[
    {
        "gender":"female", "name":{ "title":"Mrs", "first":"Ella", "last":"Christiansen" }, "location":{ "street":{ "number":2531, "name":"Bygaden" }, "city":"Odense Sv", "state":"Danmark", "country":"Denmark", "postcode":83726, "coordinates":{ "latitude":"-34.9223", "longitude":"90.4579" }, "timezone":{ "offset":"+9:00", "description":"Tokyo, Seoul, Osaka, Sapporo, Yakutsk" } }, "email":"ella.christiansen@example.com", "login":{ "uuid":"316e4190-d555-42b3-8fe2-b65aa6abf5b4", "username":"blackpanda486", "password":"trombone", "salt":"xuuiRpr7", "md5":"36cbd5018196f9f01634fedb886ecd35", "sha1":"7b5005a991ddef5e0b4570d09d32d869c7063e3d", "sha256":"d21771f54d88628b7639c678c1bd1ac394fb363e7d33719979c837100933b01c" }, "dob":{ "date":"1963-05-07T19:51:03.373Z", "age":58 }, "registered":{ "date":"2013-04-18T00:38:04.993Z", "age":8 }, "phone":"46793728", "cell":"45326483", "id":{ "name":"CPR", "value":"070563-5040" }, "picture":{ "large":"https://randomuser.me/api/portraits/women/64.jpg", "medium":"https://randomuser.me/api/portraits/med/women/64.jpg", "thumbnail":"https://randomuser.me/api/portraits/thumb/women/64.jpg" }, "nat":"DK"
    },
    {
        "gender":"male", "name":{ "title":"Mr", "first":"Énio", "last":"Mendes" }, "location":{ "street":{ "number":4795, "name":"Rua São Francisco " }, "city":"Queimados", "state":"Acre", "country":"Brazil", "postcode":44728, "coordinates":{ "latitude":"68.9388", "longitude":"-29.0877" }, "timezone":{ "offset":"+5:45", "description":"Kathmandu" } }, "email":"enio.mendes@example.com", "login":{ "uuid":"853a6d58-0711-47f9-87bb-06c6d1ce5fb1", "username":"bigelephant325", "password":"pizzas", "salt":"UyZhU3v8", "md5":"d3567d28635b70538b051cf3192b1781", "sha1":"308dafd064c7de775d6e72a907a8ac6ef117ed33", "sha256":"8709ef9aa2b99bcdc4cb84c6bda8af673aeee75ac915b484435912f290ec958f" }, "dob":{ "date":"1947-06-13T19:43:42.554Z", "age":74 }, "registered":{ "date":"2018-04-19T08:34:40.713Z", "age":3 }, "phone":"(08) 2691-0945", "cell":"(15) 7371-3240", "id":{ "name":"", "value":null }, "picture":{ "large":"https://randomuser.me/api/portraits/men/99.jpg", "medium":"https://randomuser.me/api/portraits/med/men/99.jpg", "thumbnail":"https://randomuser.me/api/portraits/thumb/men/99.jpg" }, "nat":"BR"
    }]
    ,"info":
    { "seed":"03a36b6c3de58920", "results":2, "page":1, "version":"1.3" }
}
*/


