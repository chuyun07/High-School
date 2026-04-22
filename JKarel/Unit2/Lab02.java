public pizzaParty(int pizza, int attendees)
{
   int slice = pizza*8;
   int x = slice/attendees;
   System.out.println("Each person can have " + x + " slices.")
   int l = slice%attendees;
   return "Leftovers: " + l;
}