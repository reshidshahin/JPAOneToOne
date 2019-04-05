# JPAOneToOne


@OneToOne(cascade = CascadeType.persist) -> artiq 2 entity’nide persiste elemek lazim deyil
Birini elesek onsuzda o biri entity onetoone elaqelendirilib, onsuzda avtomatik olaraq oda persist edilecek.

@OneToOne(cascade = CascadeType.remove) -> bununla ise eger bir musteri silinirse onun o biri table’daki melumatlarida silinir. Mentiqliside budu onsuzda misal: musteri silinibse onun adresi niye qalsinki...Note: istifade etmek ucun meslehet gorulmur, ancaq oneToone elaqelerde istifade edilir.
@OneToOne(cascade = CascadeType.All) -> bununlada butun icazelere icaze verirem demis oluruq. 
