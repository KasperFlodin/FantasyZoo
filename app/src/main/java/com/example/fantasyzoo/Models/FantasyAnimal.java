package com.example.fantasyzoo.Models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class FantasyAnimal {
    int id;
    String race;
    String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
//    public static void createfantasyAnimals(){
//        String json = "[{\"id\":0,\"race\":\"gryphon,\"image\":\"https://static.wikia.nocookie.net/mythological-supernatural-and-fantasy-creatures/images/b/b4/Stanley_morrison_Gryphon.jpg/revision/latest?cb=20170412123203}," +
//                "{\"id\":1,\"race\":\"chimaera,\"image\":\"https://i.pinimg.com/736x/d8/2b/ac/d82bacd012b04127beaca6a3b4aeae7d.jpg}," +
//                "{\"id\":2,\"race\":\"owlsquirl,\"image\":\"https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/d80ec524-511b-492e-b50d-93ae511594db/dgoq0zg-a8024c4e-0a17-46da-893f-62d945b1dd8b.png/v1/fit/w_375,h_214,q_70,strp/winter_owlgryph1a_by_naarok0fkor_dgoq0zg-375w.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NDU3MSIsInBhdGgiOiJcL2ZcL2Q4MGVjNTI0LTUxMWItNDkyZS1iNTBkLTkzYWU1MTE1OTRkYlwvZGdvcTB6Zy1hODAyNGM0ZS0wYTE3LTQ2ZGEtODkzZi02MmQ5NDViMWRkOGIucG5nIiwid2lkdGgiOiI8PTgwMDAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.3ERBri539_-m1IPN8l7UGKPwjcnG3toUkD1BIZjArIg}," +
//                "{\"id\":3,\"race\":\"cheetahfish,\"image\":\"https://neural.love/cdn/thumbnails/1ee51b63-b6fd-6e06-a55f-57088db3f527/b74e64f8-e8fd-5271-898a-87b4d572d44e.webp?Expires=1717199999&Signature=izA9brYC4DXRgK09aqKvhxgVDm2PkYXJ2SJ9aKSToymorhzDgHhdwMNsj~WyJN6nQT1oVmrVGiyL4Z31ZPbRNIPdyaOBOCVXmt7QSnKcgEZloHUcV56VTTRuiAMFZWdvqubrtJkyG8SrNUvg-oCjSQDJZKw-X2wUefpaKNGqJmq-zjtt3zZ-Wz-Uz7vNx9bmm7pnl~mNPtQEPyumgmT8rlmJJUpd9kIFgAf~8b18ktUv81zJu9csS~dGY23QdFJz~IAkQfn7Veg0ueqwzw3~GufqYexTd3pix3Qu2yGSVkdJi~mswGJrYquI7CQmGTc7zY-9Y7jwRKgpyOmKjr3agQ__&Key-Pair-Id=K2RFTOXRBNSROX}," +
//                "{\"id\":4,\"race\":\"koalamonkey,\"image\":\"https://i.redd.it/munai0vygm461.jpg}," +
//                "{\"id\":5,\"race\":\"koalamonkey,\"image\":\"https://i.redd.it/munai0vygm461.jpg}," +
//                "{\"id\":5,\"race\":\"koalamonkey,\"image\":\"https://i.redd.it/munai0vygm461.jpg}," +
//                "{\"id\":5,\"race\":\"koalamonkey,\"image\":\"https://i.redd.it/munai0vygm461.jpg}," +
//                "{\"id\":5,\"race\":\"koalamonkey,\"image\":\"https://i.redd.it/munai0vygm461.jpg}," +
//                "{\"id\":5,\"race\":\"koalamonkey,\"image\":\"https://i.redd.it/munai0vygm461.jpg},]";
//
//    }
}
