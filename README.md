# PRACTICE 1
In this challenge, we are going to reinforce the basic knowledge of Java object-oriented programming.

You will build a simple **animal shelter management system** that keeps track of the different types
of animals housed in the facility.
 
---

To work correctly, you must have the following classes:

- `Animal`
- `Mammal`
- `Bird`
---

### Attributes

**All animals must have:**

- Name
- Species
- Date of Birth
- Habitat (must be one of these three options):
    - `INDOOR`
    - `OUTDOOR`
    - `AQUATIC`
    
**All mammals must additionally have:**
- Whether they are carnivore (`true` / `false`)
- Number of legs

**All birds must additionally have:**
- Whether they can fly (`true` / `false`)
- Wingspan in centimetres
---

### Animals to create

In your main class, you must create the following animals.
Consider **polymorphism** for the creation of each animal:

- Simba, Lion, 15/03/2018, Mammal, carnivore, 4 legs, OUTDOOR
- Tweety, Canary, 05/09/2021, Bird, can fly, wingspan 25.0 cm, INDOOR
- Dumbo, Elephant, 22/11/2010, Mammal, not carnivore, 4 legs, OUTDOOR
- Pingu, Pengüin, 14/02/2019, Bird, cannot fly, wingspan 45.0 cm, OUTDOOR
- Luna, Dolphin, 07/04/2015, Mammal, carnivore, 0 legs, AQUATIC
- Rex, Komodo dragon, 08/08/2015, category "Reptile", OUTDOOR

 
---

### Lists and iteration

You need to create a list with **all animals**.  
Once you have the list, iterate through it and:

- Add every **mammal** to a mammals list.
- Add every **bird** to a birds list.

After each insertion into a sublist, display a message indicating that the animal has been added:

```
The animal named Simba has been added to the list of mammals
The animal named Tweety has been added to the list of birds
```

In the case of **Rex**, the following message must be displayed:

```
The animal named Rex does not belong to any animal group because its type is: Reptile
```

> Consider that other animal types may exist in the future (e.g. Fish, Amphibian).  
> The type name in the message **must be dynamic**, not hardcoded.

Once you have the three lists (all animals, mammals, birds), iterate through each of the two
sublists and display the full information of each animal on the console.
 
---

## IMPORTANT

You **cannot use the same control structure** to iterate through the mammals list and the birds list.
 
---

## Expected console output

Running the application must produce something similar to this:

```
ITERATING THROUGH ALL ANIMALS:
The animal named Simba has been added to the list of mammals
The animal named Tweety has been added to the list of birds
The animal named Dumbo has been added to the list of mammals
The animal named Pingu has been added to the list of birds
The animal named Luna has been added to the list of mammals
The animal named Rex does not belong to any animal group because its type is: Reptile
 
MAMMALS:
Simba (Lion) was born on 2018-03-15, lives in an OUTDOOR habitat, is carnivore: true, has 4 legs
Dumbo (Elephant) was born on 2010-11-22, lives in an OUTDOOR habitat, is carnivore: false, has 4 legs
Luna (Dolphin) was born on 2015-04-07, lives in an AQUATIC habitat, is carnivore: true, has 0 legs
 
BIRDS:
Tweety (Canary) was born on 2021-09-05, lives in an INDOOR habitat, can fly: true, wingspan: 25.0 cm
Pingu (Pengüin) was born on 2019-02-14, lives in an OUTDOOR habitat, can fly: false, wingspan: 45.0 cm
```
 
---

## Considerations

Keep in mind that you need to apply:

- **Inheritance and Polymorphism**
- **Classes and Objects**
- **Data types, control structures, and expressions**
- **Two different control flow statements**, one for each sublist (mammals / birds)
- **Enumerations** for the habitat type
  If you need to review any theory, refer to the materials provided by your tutor.

---

## Solution

To have this challenge approved, you need the approval of your technical lead.

Additionally, you need to run the application and obtain output matching the expected result shown above.
