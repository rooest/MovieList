package com.omer.movielist.utils

import com.orhanobut.logger.Logger

object JsonFiles {

    fun getSuccessJsonString(): String {
        return "{\n" +
                "  \"page\": 1,\n" +
                "  \"total_results\": 20000,\n" +
                "  \"total_pages\": 1000,\n" +
                "  \"results\": [\n" +
                "    {\n" +
                "      \"original_name\": \"フェアリーテイル\",\n" +
                "      \"genre_ids\": [\n" +
                "        16,\n" +
                "        35,\n" +
                "        10759,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"Fairy Tail\",\n" +
                "      \"popularity\": 529.562,\n" +
                "      \"origin_country\": [\n" +
                "        \"JP\"\n" +
                "      ],\n" +
                "      \"vote_count\": 120,\n" +
                "      \"first_air_date\": \"2009-10-12\",\n" +
                "      \"backdrop_path\": \"\\/m2lugAG39sO0yCcuxEAu4fY5u1o.jpg\",\n" +
                "      \"original_language\": \"ja\",\n" +
                "      \"id\": 46261,\n" +
                "      \"vote_average\": 6.8,\n" +
                "      \"overview\": \"Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.\",\n" +
                "      \"poster_path\": \"\\/58GKcwFV3lpVOGzybeMrrNOjHpz.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Doom Patrol\",\n" +
                "      \"genre_ids\": [\n" +
                "        10759,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"Doom Patrol\",\n" +
                "      \"popularity\": 348.934,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 19,\n" +
                "      \"first_air_date\": \"2019-02-15\",\n" +
                "      \"backdrop_path\": \"\\/sAzw6I1G9JUxm86KokIDdQeWtaq.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 79501,\n" +
                "      \"vote_average\": 5.6,\n" +
                "      \"overview\": \"The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.\",\n" +
                "      \"poster_path\": \"\\/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"ドラゴンボール\",\n" +
                "      \"genre_ids\": [\n" +
                "        16,\n" +
                "        35,\n" +
                "        10759,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"Dragon Ball\",\n" +
                "      \"popularity\": 246.961,\n" +
                "      \"origin_country\": [\n" +
                "        \"JP\"\n" +
                "      ],\n" +
                "      \"vote_count\": 241,\n" +
                "      \"first_air_date\": \"1986-02-26\",\n" +
                "      \"backdrop_path\": \"\\/iflq7ZJfso6WC7gk9l1tD3unWK.jpg\",\n" +
                "      \"original_language\": \"ja\",\n" +
                "      \"id\": 12609,\n" +
                "      \"vote_average\": 7.5,\n" +
                "      \"overview\": \"Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Goku's home. Together, they set off to find all seven dragon balls in an adventure that would change Goku's life forever. See how Goku met his life long friends Bulma, Yamcha, Krillin, Master Roshi and more. And see his adventures as a boy, all leading up to  Dragonball Z and later  Dragonball GT.\",\n" +
                "      \"poster_path\": \"\\/3wx3EAMtqnbSLhGG8NrqXriCUIQ.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Arrow\",\n" +
                "      \"genre_ids\": [\n" +
                "        80,\n" +
                "        18,\n" +
                "        9648,\n" +
                "        10759\n" +
                "      ],\n" +
                "      \"name\": \"Arrow\",\n" +
                "      \"popularity\": 238.047,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 2254,\n" +
                "      \"first_air_date\": \"2012-10-10\",\n" +
                "      \"backdrop_path\": \"\\/dKxkwAJfGuznW8Hu0mhaDJtna0n.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 1412,\n" +
                "      \"vote_average\": 5.9,\n" +
                "      \"overview\": \"Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.\",\n" +
                "      \"poster_path\": \"\\/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"The Flash\",\n" +
                "      \"genre_ids\": [\n" +
                "        18,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"The Flash\",\n" +
                "      \"popularity\": 223.166,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 2506,\n" +
                "      \"first_air_date\": \"2014-10-07\",\n" +
                "      \"backdrop_path\": \"\\/jC1KqsFx8ZyqJyQa2Ohi7xgL7XC.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 60735,\n" +
                "      \"vote_average\": 6.7,\n" +
                "      \"overview\": \"After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \\\"meta-human\\\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.\",\n" +
                "      \"poster_path\": \"\\/fki3kBlwJzFp8QohL43g9ReV455.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"The Umbrella Academy\",\n" +
                "      \"genre_ids\": [\n" +
                "        10759,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"The Umbrella Academy\",\n" +
                "      \"popularity\": 204.188,\n" +
                "      \"origin_country\": [\n" +
                "        \"CA\",\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 39,\n" +
                "      \"first_air_date\": \"2019-02-15\",\n" +
                "      \"backdrop_path\": \"\\/gHJhN9AJV4PmJ7YpLFa9ldDWuG8.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 75006,\n" +
                "      \"vote_average\": 8.1,\n" +
                "      \"overview\": \"A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.\",\n" +
                "      \"poster_path\": \"\\/uYHdIs5O8tiU5p6MvUPd2jElOH6.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Hanna\",\n" +
                "      \"genre_ids\": [\n" +
                "        18,\n" +
                "        10759\n" +
                "      ],\n" +
                "      \"name\": \"Hanna\",\n" +
                "      \"popularity\": 200.447,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 6,\n" +
                "      \"first_air_date\": \"2019-03-28\",\n" +
                "      \"backdrop_path\": \"\\/oUuyMvdBIZiJHEGtKYrIZO7hyd7.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 54155,\n" +
                "      \"vote_average\": 0,\n" +
                "      \"overview\": \"This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.\",\n" +
                "      \"poster_path\": \"\\/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Game of Thrones\",\n" +
                "      \"genre_ids\": [\n" +
                "        18,\n" +
                "        10759,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"Game of Thrones\",\n" +
                "      \"popularity\": 196.556,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 5305,\n" +
                "      \"first_air_date\": \"2011-04-17\",\n" +
                "      \"backdrop_path\": \"\\/gX8SYlnL9ZznfZwEH4KJUePBFUM.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 1399,\n" +
                "      \"vote_average\": 8.2,\n" +
                "      \"overview\": \"Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.\",\n" +
                "      \"poster_path\": \"\\/gwPSoYUHAKmdyVywgLpKKA4BjRr.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"ナルト 疾風伝\",\n" +
                "      \"genre_ids\": [\n" +
                "        16,\n" +
                "        35,\n" +
                "        18\n" +
                "      ],\n" +
                "      \"name\": \"Naruto Shippūden\",\n" +
                "      \"popularity\": 191.311,\n" +
                "      \"origin_country\": [\n" +
                "        \"JP\"\n" +
                "      ],\n" +
                "      \"vote_count\": 193,\n" +
                "      \"first_air_date\": \"2007-02-15\",\n" +
                "      \"backdrop_path\": \"\\/c14vjmndzL9tBdooGsMznMFrFLo.jpg\",\n" +
                "      \"original_language\": \"ja\",\n" +
                "      \"id\": 31910,\n" +
                "      \"vote_average\": 7.5,\n" +
                "      \"overview\": \"Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) en emies, in the likes of the shinobi organization; Akatsuki.\",\n" +
                "      \"poster_path\": \"\\/ic9Gb4Zz09ns3JPYHdax8u5kt0n.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Riverdale\",\n" +
                "      \"genre_ids\": [\n" +
                "        18,\n" +
                "        9648\n" +
                "      ],\n" +
                "      \"name\": \"Riverdale\",\n" +
                "      \"popularity\": 182.276,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 446,\n" +
                "      \"first_air_date\": \"2017-01-26\",\n" +
                "      \"backdrop_path\": \"\\/2IUpoKSP64r6rp2vBo0Fdk8a1UU.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 69050,\n" +
                "      \"vote_average\": 7.1,\n" +
                "      \"overview\": \"Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.\",\n" +
                "      \"poster_path\": \"\\/gskv297rlbyzLaTU1XZf8UBbxp0.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Supernatural\",\n" +
                "      \"genre_ids\": [\n" +
                "        18,\n" +
                "        9648,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"Supernatural\",\n" +
                "      \"popularity\": 166.171,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 1705,\n" +
                "      \"first_air_date\": \"2005-09-13\",\n" +
                "      \"backdrop_path\": \"\\/o9OKe3M06QMLOzTl3l6GStYtnE9.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 1622,\n" +
                "      \"vote_average\": 7.3,\n" +
                "      \"overview\": \"When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. \",\n" +
                "      \"poster_path\": \"\\/3iFm6Kz7iYoFaEcj4fLyZHAmTQA.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"The Walking Dead\",\n" +
                "      \"genre_ids\": [\n" +
                "        18,\n" +
                "        10759,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"The Walking Dead\",\n" +
                "      \"popularity\": 165.492,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 3978,\n" +
                "      \"first_air_date\": \"2010-10-31\",\n" +
                "      \"backdrop_path\": \"\\/xVzvD5BPAU4HpleFSo8QOdHkndo.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 1402,\n" +
                "      \"vote_average\": 7.3,\n" +
                "      \"overview\": \"Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.\",\n" +
                "      \"poster_path\": \"\\/bjU4tLlyp8W4yTB0Hqn8J1IDUnD.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Family Guy\",\n" +
                "      \"genre_ids\": [\n" +
                "        16,\n" +
                "        35\n" +
                "      ],\n" +
                "      \"name\": \"Family Guy\",\n" +
                "      \"popularity\": 162.513,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 1404,\n" +
                "      \"first_air_date\": \"1999-01-31\",\n" +
                "      \"backdrop_path\": \"\\/pH38r4TWTqq7Mcs6XAlwgzNUeJe.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 1434,\n" +
                "      \"vote_average\": 6.5,\n" +
                "      \"overview\": \"Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.\",\n" +
                "      \"poster_path\": \"\\/gBGUL1UTUNmdRQT8gA1LUV4yg39.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"ソードアート・オンライン\",\n" +
                "      \"genre_ids\": [\n" +
                "        16,\n" +
                "        10759,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"Sword Art Online\",\n" +
                "      \"popularity\": 158.985,\n" +
                "      \"origin_country\": [\n" +
                "        \"JP\"\n" +
                "      ],\n" +
                "      \"vote_count\": 174,\n" +
                "      \"first_air_date\": \"2012-07-08\",\n" +
                "      \"backdrop_path\": \"\\/1ENifuXpviC2kEZ1Ya08EyN9SYg.jpg\",\n" +
                "      \"original_ language\": \"ja\",\n" +
                "      \"id\": 45782,\n" +
                "      \"vote_average\": 7.5,\n" +
                "      \"overview\": \"The players of a virtual reality MMORPG, Sword Art Online, are trapped and fighting for their very lives. After it is announced that the only way to leave the game is by beating it, Kirito—a very powerful swordsman—and his friends take on a quest to free all the minds trapped in Aincrad.\",\n" +
                "      \"poster_path\": \"\\/rNlv3ePwRnla6LdnMtWe6KZd9n8.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"The Simpsons\",\n" +
                "      \"genre_ids\": [\n" +
                "        16,\n" +
                "        35\n" +
                "      ],\n" +
                "      \"name\": \"The Simpsons\",\n" +
                "      \"popularity\": 154.001,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 1874,\n" +
                "      \"first_air_date\": \"1989-12-17\",\n" +
                "      \"backdrop_path\": \"\\/lnnrirKFGwFW18GiH3AmuYy40cz.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 456,\n" +
                "      \"vote_average\": 7.1,\n" +
                "      \"overview\": \"Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.\",\n" +
                "      \"poster_path\": \"\\/yTZQkSsxUFJZJe67IenRM0AEklc.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"ワンピース\",\n" +
                "      \"genre_ids\": [\n" +
                "        16,\n" +
                "        35,\n" +
                "        10759\n" +
                "      ],\n" +
                "      \"name\": \"One Piece\",\n" +
                "      \"popularity\": 142.472,\n" +
                "      \"origin_country\": [\n" +
                "        \"JP\"\n" +
                "      ],\n" +
                "      \"vote_count\": 197,\n" +
                "      \"first_air_date\": \"1999-10-20\",\n" +
                "      \"backdrop_path\": \"\\/xgs7zAF5VSGAK0QstH1Q0ivybXz.jpg\",\n" +
                "      \"original_language\": \"ja\",\n" +
                "      \"id\": 37854,\n" +
                "      \"vote_average\": 7.7,\n" +
                "      \"overview\": \"Years ago, the fearsome pirate king Gol D. Roger was executed, leaving a huge pile of treasure and the famous \\\"One Piece\\\" behind. Whoever claims the \\\"One Piece\\\" will be named the new pirate king. Monkey D. Luffy, a boy who consumed one of the \\\"Devil's Fruits\\\", has it in his head that he'll follow in the footsteps of his idol, the pirate Shanks, and find the One Piece. It helps, of course, that his body has the properties of rubber and he's surrounded by a bevy of skilled fighters and thieves to help him along the way. Monkey D. Luffy brings a bunch of his crew followed by, Roronoa Zoro, Nami, Usopp, Sanji, Tony-Tony Chopper, Nico Robin, Franky, and Brook. They will do anything to get the One Piece and become King of the Pirates!\",\n" +
                "      \"poster_path\": \"\\/yeJyZkhO7WS4jJl2xqQjnRTHwuE.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Marvel's Iron Fist\",\n" +
                "      \"genre_ids\": [\n" +
                "        80,\n" +
                "        18,\n" +
                "        10759,\n" +
                "        10765\n" +
                "      ],\n" +
                "      \"name\": \"Marvel's Iron Fist\",\n" +
                "      \"popularity\": 140.314,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 786,\n" +
                "      \"first_air_date\": \"2017-03-17\",\n" +
                "      \"backdrop_path\": \"\\/xHCfWGlxwbtMeeOnTvxUCZRGnkk.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 62127,\n" +
                "      \"vote_average\": 6.1,\n" +
                "      \"overview\": \"Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.\",\n" +
                "      \"poster_path\": \"\\/nv4nLXbDhcISPP8C1mgaxKU50KO.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"The Blacklist\",\n" +
                "      \"genre_ids\": [\n" +
                "        80,\n" +
                "        18,\n" +
                "        9648\n" +
                "      ],\n" +
                "      \"name\": \"The Blacklist\",\n" +
                "      \"popularity\": 138.434,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 888,\n" +
                "      \"first_air_date\": \"2013-09-23\",\n" +
                "      \"backdrop_path\": \"\\/fHwiAqIKragaCbNJo9Qs4lrccIN.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 46952,\n" +
                "      \"vote_average\": 7.1,\n" +
                "      \"overview\": \"Raymond \\\"Red\\\" Reddington, one of the FBI's most wanted fugitives, surrenders in person at FBI Headquarters in Washington, D.C. He claims that he and the FBI have the same interests: bringing down dangerous criminals and terrorists. In the last two decades,  he's made a list of criminals and terrorists that matter the most but the FBI cannot find because it does not know they exist. Reddington calls this \\\"The Blacklist\\\". Reddington will co-operate, but insists that he will speak only to Elizabeth Keen, a rookie FBI profiler.\",\n" +
                "      \"poster_path\": \"\\/bgbQCW4fE9b6wSOSC6Fb4FfVzsW.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Gotham\",\n" +
                "      \"genre_ids\": [\n" +
                "        80,\n" +
                "        18,\n" +
                "        14\n" +
                "      ],\n" +
                "      \"name\": \"Gotham\",\n" +
                "      \"popularity\": 137.834,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 1014,\n" +
                "      \"first_air_date\": \"2014-09-22\",\n" +
                "      \"backdrop_path\": \"\\/mKBP1OCgCG0jw8DwVYlnYqVILtc.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 60708,\n" +
                "      \"vote_average\": 6.9,\n" +
                "      \"overview\": \"Before there was Batman, there was GOTHAM. \\n\\nEveryone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker? \",\n" +
                "      \"poster_path\": \"\\/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"original_name\": \"Grey's Anatomy\",\n" +
                "      \"genre_ids\": [\n" +
                "        18\n" +
                "      ],\n" +
                "      \"name\": \"Grey's Anatomy\",\n" +
                "      \"popularity\": 135.966,\n" +
                "      \"origin_country\": [\n" +
                "        \"US\"\n" +
                "      ],\n" +
                "      \"vote_count\": 865,\n" +
                "      \"first_air_date\": \"2005-03-27\",\n" +
                "      \"backdrop_path\": \"\\/y6JABtgWMVYPx84Rvy7tROU5aNH.jpg\",\n" +
                "      \"original_language\": \"en\",\n" +
                "      \"id\": 1416,\n" +
                "      \"vote_average\": 6.3,\n" +
                "      \"overview\": \"Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.\",\n" +
                "      \"poster_path\": \"\\/mgOZSS2FFIGtfVeac1buBw3Cx5w.jpg\"\n" +
                "    }\n" +
                "  ]\n" +
                "}"
    }


    fun getOneResult(): String {
        return "{\"first_air_date\":\"2009-10-12\",\"id\":46261,\"poster_path\":\"/58GKcwFV3lpVOGzybeMrrNOjHpz.jpg\",\"name\":\"Fairy Tail\",\"original_language\":\"ja\",\"overview\":\"Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn\\u0027t just any ordinary kid, he\\u0027s a member of one of the world\\u0027s most infamous mage guilds: Fairy Tail.\",\"vote_average\":6.8,\"vote_count\":\"120\"}"
    }
}