2) Analyse de programmes:
a)le code va afficher 4;7 et 17;
l'objet u de la class A et attibut x
u.x=1 et la methode f() va retourner x=3 ce qui donne 4
l'objet v
v.x = 4  et on execute la methode f() de v qui va return x + 3 = 4 + 3 = 7
this.x = u.x = 1
a.x = v.x = 4 alors 2 * x + 3 * a.x = 2 * 1 + 3 * 4 = 2 + 12 = 14
la methode f() de w va return x + 3 = 14 + 3 = 17
b)on change la valeur de x dans w, donc  w.x = 3.
System.out.println(w.f());
la fonction  f() renvoie 3 + 3 = 6
affiche : 6
c)on redefinit la methode toString()
public String toString() {
    return "A(x = " + x + ")";
}
d)on met private l'attribut x alors w.x = 3;
2a)le programme va afficher :
nbB = 0
nbB= 1
nbB= 2
albert
boris
3a)le programme va afficher:
u=1   g ne modifie pas la variable réelle
y=3.1  x est le copie de y
t1=2.5 1   de f(t2)
t2=0.0 3 on l'a modifie dans h
