# Planes.java

Treść projektu

Współcześnie jedną z atrakcyjniejszych form transportu jest transport lotniczy. Przewoźnicy dysponują różnorodnymi flotami statków powietrznych, które przewożą pasażerów lub ładunki. Przestrzeń powietrzna współdzielona jest też przez innych użytkowników
takich jak siły wojskowe, sportowcy czy modelarze. 
Niewątpliwie każdy z uczestników ruchu powietrznego będzie miał:
• pozycję,
• wektor ruchu,
• pułap,
• prędkość.
znajdź inne cechy wspólne oraz różnice wszystkich statków powietrznych, a następnie
stwórz kompletną hierarchię klas opisującą użytkowników przestrzeni powietrznej (z wyłączeniem organizmów żywych).
W metodzie main przygotuj przykład zawierający przynajmniej 10 różnych statków
powietrznych w każdej z wyizolowanych klas. Jeżeli program zostanie uruchomiony z
parametrem:
• save – wówczas do pliku tekstowego zostaną zapisane wszystkie parametry identyfikujące statki powietrzne (przyjmując że każdy statek powietrzny zostanie zapisany
w nowej linii, a kolejne parametry zostaną oddzielone przecinkami);
• load <par> – wówczas z pliku tekstowego zastaną wczytane wszystkie przechowane tam statki, przyczym każdy statek zostanie dodany <par> razy na losowych
współrzędnych i losowym pułapie.
Wszystkie wczytywane z pliku statki będą przechowywane w dwuwymiarowej tablicy,
której kolejne wiersze będą reprezentowały odległość statku powietrznego (od radaru zlokalizowanego na współrzędnych 0, 0 i pułapie 0). Przyjmij że kolejne wiersze tablicy będą
przechowywały wszystkie statki powietrzne, których odległość jest mniejsza od elementów
ciągu geometrycznego opisanego przez iloraz ciągu q = 3, pierwszym elementem będzie
a1 = 3, a kolejnymi: a2 = 9, a3 = 27. W każdym wierszu statki muszą zostać posortowane
(przez wstawianie) w porządku rosnącym.

