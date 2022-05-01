## Evaluation PTC
Le dépôt contient la documentation ``doc`` générée par ``javadoc`` et deux classes java : 
* ``Partition.java`` qui contient une seule méthode static (``partition``). 
* ``TestjUnit4`` pour les tests unitaires en jUnit4 : contient 3 tests.

### Utilisation :
Récupérez la calsse ``Partition.java``. Cette dernière peut être utilisée indépendament du reste du code en faisant appel à sa méthode static (``partition``).

### Tests unitaires :
Version : jUnit4. <br/>
Bibliothèques utilisées : ```org.hamcrest.core_1.3.0.v20180420-1519.jar``` et ```org.junit_4.13.0.v20200204-1500.jar```.<br/>
Vous pouvez les télécharger à partir du [junit4](https://junit.org/junit4/). <br/>
Sinon utilisez un IDE comme (eclipse ou IntelliJ...) ou un gestionnaire de projet comme ``maven``. <br/>
Il y a 3 tests unitaires :
* ``sublistsMaxSizeIsGreaterThanInitList`` : le cas où la taille max des sous-listes est supérieure à la taille de la liste divisée.
* ``simpleTest`` et ``simpleTest2`` : vérifie le nombre de sous-listes dans la liste renvoyée.
