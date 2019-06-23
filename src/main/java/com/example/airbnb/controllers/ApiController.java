package com.example.airbnb.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.airbnb.entities.Accessibility;
import com.example.airbnb.entities.AirbnbProperty;
import com.example.airbnb.entities.Amenity;
import com.example.airbnb.entities.CancellationPolicyHouseRule;
import com.example.airbnb.entities.GuestSuite;
import com.example.airbnb.entities.Host;
import com.example.airbnb.entities.Location;
import com.example.airbnb.entities.OtherHighlyRatedHome;
import com.example.airbnb.entities.Review;
import com.example.airbnb.entities.ThingsToDo;

@RestController
@RequestMapping(path="/api")
public class ApiController {

    @GetMapping(value="/property", produces="application/json")
    public AirbnbProperty[] displayProperty() {

        AirbnbProperty[] properties = {
            new AirbnbProperty(
                "Chic Room with Bath and Kitchenette Living Area",
                "https://a0.muscache.com/4ea/air/v2/pictures/d5e090ac-b2b6-4f9e-a578-3d9405c8477f.jpg?t=r:w2500-h1500-sfit,e:fjpg-c90",
                3,
                1,
                1,
                1,
                "Enjoy the central location and easy accessibility to public transit from this stylish, ground floor studio. Inside the private room, admire details like the full-height mural, complete mosaic bathroom, and soft, woven textiles maximising comfort.",
                "https://a0.muscache.com/im/users/6498963/profile_pic/1406724152/original.jpg?aki_policy=profile_x_medium",
                "Nicholas & Michele"
            ),
        };

        return properties;
    }

    @GetMapping(value="/property/tour_this_guest_suite", produces="application/json")
    public GuestSuite[] displayGuestSuite() {

        GuestSuite[] guestSuites = {
            new GuestSuite(
                "https://a0.muscache.com/im/pictures/5b672d57-4564-4690-9600-0ac9b40c562e.jpg?aki_policy=x_medium",
                "Private living room",
                false, false, false, false, false
            ),
            new GuestSuite(
                "https://a0.muscache.com/im/pictures/46bc761d-ab43-426f-b289-f0916215e466.jpg?aki_policy=x_medium",
                "Private bedroom",
                true, false, false, false, false
            ),
            new GuestSuite(
                "https://a0.muscache.com/im/pictures/8eff0f5c-8c25-4658-8f95-e437df0f59b3.jpg?aki_policy=x_medium",
                "Private kitchenette",
                false, false, false, false, false
            ),
            new GuestSuite(
                "https://a0.muscache.com/im/pictures/9a7751c9-8dd2-4882-b9fc-130082a0f468.jpg?aki_policy=x_medium",
                "Private full bathroom",
                false, false, false, false, false
            ),
        };

        return guestSuites;
    }

    @GetMapping(value="/property/amenities", produces="application/json")
    public Amenity[] displayAmenity() {

        Amenity[] amenities = {
            new Amenity(
                true, true, true, true, true, true, true, true, true, true, true, true, false, false, false
            ),
        };

        return amenities;
    }

    @GetMapping(value="/property/accessibility", produces="application/json")
    public Accessibility[] displayAccessibility() {

        Accessibility[] accessibiliies = {
            new Accessibility(
                "Flat path to guest entrance"
            ),
        };

        return accessibiliies;
    }

    @GetMapping(value="/property/location", produces="application/json")
    public Location[] displayLocation() {

        Location[] locations = {
            new Location(
                "London",
                "United Kingdom",
                "The studio is situated under the owners' raised first floor apartment, so it's very private. It's located in Camberwell New Road, a vibrant, artistic area with a choice of cafes, markets, and transport links—all just a short walk away.",
                "Heathrow Airport",
                "44 mins by car"
            ),
        };

        return locations;
    }

    @GetMapping(value="/property/reviews", produces="application/json")
    public Review[] displayReview() {

        Review[] reviews = {
            new Review(
                "Tabatha",
                "2 months ago",
                "Very convenient location. It was easy to get around and enjoy the city."
            ),
            new Review(
                "Thomas",
                "2 months ago",
                "I was impressed by this place. It’s in a great location. It’s located within 2 minutes of a small grocery store, laundry mat, bus stop, and cafe. You can reach all of the major sites in London less than 30 minutes by bus and underground tube. Really easy to get around from this location."
            ),
            new Review(
                "Nancy",
                "U2 months ago",
                "A great place to stay while visiting London! Convenient to transit to get to the center quickly, but a quiet, restful place to come back to. The apartment is comfortable, stylish, and as described. Nicholas was available, responsive, and helpful.."
            ),
            new Review(
                "Cary",
                "2 months ago",
                "I had high expectations for this place and I was not disappointed. Nicholas and Michele were friendly and responsive hosts. The apartment is well-appointed, and the station is a bit of a walk (10 minutes) but I personally enjoyed being in a neighborhood that had a chiller vibe than central London. A 30-minute tube or bus ride gets you to pretty much any place you would want to be in the city! I would book this location again."
            ),
            new Review(
                "Manuela",
                "3 months ago",
                "The Airbnb is everything and more! It has the best of amenities and is a 10 minute walk from the oval station that can take you anywhere in London. It is also a 2 minute walk from a bus stop that is very well connected. There is also a co-op market around the block that is great to pick up small things or to even full meals to cook in the well stocked kitchen. We spent about 8 days at the Airbnb and we all felt like it enhanced our experience while in London for the first time. Would recommend this to anyone wanting to be near the center of London and want to feel comfortable through out the entire stay. Sometimes hotels feel cold and empty but that’s not something you would encounter with this home."
            ),
            new Review(
                "Dawn",
                "4 months ago",
                "You will love Nicholas and Michele’s modern apartment. It has everything you need to make your trip a memorable one. We were so pleased that there was a grocery store around the corner and we were close to the underground. Nicolas and Michele are wonderful hosts who were always available to answer all our silly questions."
            ),
        };

        return reviews;
    }

    @GetMapping(value="/property/meet_your_host", produces="application/json")
    public Host[] displayhost() {

        String[] languages = {"English", "Deutsch"};

        Host[] hosts = {
            new Host(
                "https://a0.muscache.com/im/users/6498963/profile_pic/1406724152/original.jpg?aki_policy=profile_large",
                "Nicholas & Michele",
                "Artist from London and interior designer. I am English/German and my partner is Italian. I have been living in London for over 18 years so can always point you in the right direction if you need any ideas. Although London at first seems a bit vast it's surprising how much you can cover on foot or bicycle without being entirely exhausted and I can help you get the most out of a first visit with ideas on what to see and do.",
                true, true,
                "May 2013",
                languages,
                100,
                "within an hour"
            ),
        };

        return hosts;
    }

    @GetMapping(value="/property/cancellation_policy_and_house_rules", produces="application/json")
    public CancellationPolicyHouseRule[] displayCancellationPolicyHouseRule() {

        CancellationPolicyHouseRule[] cancellationPolicyHouseRules = {
            new CancellationPolicyHouseRule(
                "Moderate",
                "Cancel within 48 hours of booking"
            ),
        };

        return cancellationPolicyHouseRules;
    }

    @GetMapping(value="/property/other_highly_rated_homes", produces="application/json")
    public OtherHighlyRatedHome[] displayOtherHighlyRatedHome() {

        OtherHighlyRatedHome[] otherHighlyRatedHomes = {
            new OtherHighlyRatedHome(
                "https://a0.muscache.com/4ea/air/v2/pictures/e6f60fe0-3302-4a5d-b087-dd3f714d3c1d.jpg?t=r:w2500-h1500-sfit,e:fjpg-c90",
                true, true,
                "London",
                "Cosy, Enchanting Coach House in Telegraph Hill",
                343,
                5,
                174
            ),
            new OtherHighlyRatedHome(
                "https://a0.muscache.com/4ea/air/v2/pictures/f6a93315-4f5e-4264-9679-1a32b23d5134.jpg?t=r:w2500-h1500-sfit,e:fjpg-c90",
                true, true,
                "London",
                "Unwind Under the Pergola of a Bright Garden Flat",
                607,
                5,
                202
            ),
            new OtherHighlyRatedHome(
                "https://a0.muscache.com/4ea/air/v2/pictures/20fecbcf-b6cb-4508-95b7-7bea130e0eb5.jpg?t=r:w2500-h1500-sfit,e:fjpg-c90",
                true, true,
                "London",
                "Highbury Garden House - King Room",
                443,
                5,
                224
            ),
            new OtherHighlyRatedHome(
                "https://a0.muscache.com/4ea/air/v2/pictures/701da6b1-f082-4f68-85b2-5f35a5d6fe30.jpg?t=r:w2500-h1500-sfit,e:fjpg-c90",
                true, true,
                "London",
                "Chill on the Leafy Terrace of a Designer Duplex",
                396,
                4.5,
                299
            ),
        };

        return otherHighlyRatedHomes;
    }

    @GetMapping(value="/property/things_to_do_near_this_home", produces="application/json")
    public ThingsToDo[] displayThingsToDo() {

        String[] languages01 = {""};
        String[] languages02 = {"All"};
        String[] languages03 = {"Spanish"};
        String[] languages04 = {"French"};

        ThingsToDo[] thingsToDos = {
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/9ae1520e-750a-4c06-98d9-df56aa6b8bb2.jpg?aki_policy=xl_poster",
                "PHOTO SHOOT",
                "Photoshoot in London Secret Corners",
                321,
                2.5,
                false, false, false, true, false,
                5,
                226,
                languages02
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/a7870d12-4f69-46d9-8a28-e5bee22826bb.jpg?aki_policy=xl_poster",
                "PHOTO WALK",
                "Awesome photos on Instagram - private",
                229,
                1,
                false, false, false, true, true,
                4.93,
                406,
                languages02
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/065884d5-d5cc-4e88-91a0-9c7835f008a6.jpg?aki_policy=xl_poster",
                "HISTORY WALK",
                "London's Amazing Palaces & Parliament",
                104,
                3,
                false, false, false, false, false,
                4.92,
                671,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/02500835-260a-4fbd-8b18-36c22b67eecd.jpg?aki_policy=xl_poster",
                "PADDLEBOARDING",
                "Paddleboard Regent's Park & London Zoo",
                229,
                1.5,
                false, false, true, true, false,
                4.97,
                173,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/e44a6b46-980e-4e6c-bff3-1ca1d1d8be05.jpg?aki_policy=xl_poster",
                "HISTORY WALK",
                "See 30+ Top London Sights. Fun Guide!",
                256,
                5,
                false, false, false, false, false,
                4.91,
                1056,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/93ed77f9-4413-46d5-bd2e-5276b8269633.jpg?aki_policy=xl_poster",
                "PHOTO SHOOT",
                "Beautiful days London Photoshoot",
                267,
                2,
                false, false, false, true, false,
                4.83,
                422,
                languages03
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/ff67fe4c-bfef-4647-ad64-e07612a4d7e0.jpg?aki_policy=xl_poster",
                "DANCE PARTY",
                "London Nightlife on a budget",
                66,
                4.5,
                false, false, true, false, true,
                5,
                18,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/57b3b0c1-e13a-4c58-bc13-a0970a5c1844.jpg?aki_policy=xl_poster",
                "PLANE RIDE",
                "Private Flight around London",
                626,
                1,
                false, false, false, true, false,
                5,
                4,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/c3989515-5a62-4866-bedf-304d37c0f326.jpg?aki_policy=xl_poster",
                "HISTORY WALK",
                "Harry Potter Walking Tour. Kids Free!",
                98,
                3,
                false, false, false, false, false,
                4.86,
                701,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/953b3fe2-87ec-426a-a4d9-3352d2743f04.jpg?aki_policy=xl_poster",
                "ART WALK",
                "Camden Graffiti / Street Art Tour",
                136,
                2,
                false, false, false, false, false,
                4.9,
                110,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/5392d082-5466-4dd0-ad79-f0f576ee26f0.jpg?aki_policy=xl_poster",
                "BIKE RIDE",
                "NO DIET CLUB - Best food tour in LDN !",
                289,
                4,
                false, true, false, true, false,
                4.88,
                320,
                languages04
            ),
			new ThingsToDo(
                "https://a0.muscache.com/im/pictures/570ef305-1424-496e-8049-628d8ca7ba28.jpg?aki_policy=xl_poster",
                "TEA TASTING",
                "Tea at the Palace",
                468,
                2,
                false, true, false, false, false,
                4.85,
                230,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/2bc12ba8-5746-401f-9577-12f0bf3d0028.jpg?aki_policy=xl_poster",
                "HISTORY WALK",
                "Retired Royal Guard Central London Walk",
                109,
                2.5,
                false, false, false, false, false,
                4.95,
                200,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/994b9560-3972-407f-817f-719744325eb3.jpg?aki_policy=xl_poster",
                "PHOTO WALK",
                "London Insta-worthy Private Photoshoot",
                354,
                1,
                false, false, false, true, false,
                5,
                27,
                languages02
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/e6c3c68b-5ca5-4f02-80c4-354b20b5b69f.jpg?aki_policy=xl_poster",
                "CAR RIDE",
                "Discover London in an Iconic Black Cab",
                316,
                3,
                false, false, true, false, false,
                4.97,
                118,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/d3aa95fe-4250-4b34-aefd-17669d0cf1d9.jpg?aki_policy=xl_poster",
                "CULTURE WALK",
                "A Secret Tour: Explore Hidden London",
                164,
                6,
                false, false, false, false, false,
                4.92,
                225,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/6f3426d8-6f63-4d37-9d0d-b8c87b8267e9.jpg?aki_policy=xl_poster",
                "BIKE RIDE",
                "Best of London Bike Ride + beer + art",
                191,
                3.5,
                false, false, false, true, false,
                4.92,
                137,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/8df70d83-676a-44bf-8d50-47dfdbc8ffbe.jpg?aki_policy=xl_poster",
                "CULTURE WALK",
                "Explore Harry Potter's London Tour",
                71,
                2.5,
                false, false, false, true, false,
                4.94,
                915,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/858a9be6-5c8c-42dc-91dc-255c3f2ea077.jpg?aki_policy=xl_poster",
                "BIKE RIDE",
                "Unseen London by Bicycle",
                212,
                4.5,
                true, false, true, false, false,
                4.92,
                480,
                languages01
            ),
            new ThingsToDo(
                "https://a0.muscache.com/im/pictures/609c95c6-73e4-419c-a99a-b6b35546e373.jpg?aki_policy=xl_poster",
                "CULTURE WALK",
                "See Notting Hill Walking Tour",
                55,
                2,
                false, false, false, false, false,
                4.88,
                347,
                languages01
            ),
        };

        return thingsToDos;
    }
}
