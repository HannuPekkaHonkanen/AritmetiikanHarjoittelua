## Javalabra / Hannu Honkanen, periodi 5/2014

## Aiheen kuvaus
**Aihe:** Aritmetiikan harjoittelua

**Kuvaus:**
Ohjelmalla harjoittellaan peruslaskutoimituksia sekä laskutoimitusyhdistelmiä. Ohjelma kysyy toistuvasti kahden luvun summia, erotuksia, tuloja, osamääriä tai moniosaisia laskutoimituksia. 

Ohjelma arpoo kysyttävät luvut. Käyttäjä voi ohjata kysyttäviä laskutoimituksia: mitä laskutoimituksia harjoitellaan, arvotaanko harjoiteltavat laskutoimitukset vai harjoitellaanko moniosaisia laskutoimituksia.

**Käyttäjät:** opiskelija (tai kuka tahansa käyttäjä)

**Käyttäjän Opiskelija toiminnot:**
- valitse harjoiteltava laskutoimitustyyppi tai moniosaiset laskutoimitukset
- luo uusi harjoitus
- tarkista vastaukset
- lopeta harjoittelu

**Laajennusideoita:**
- "Repetitio mater studiorum est" eli kertaus on opintojen äiti: toistetaan tehtäviä, joita ei osattu ensimmäisellä kerralla.
- kirjautuminen
- Tehtävätyyppejä, jotka ovat opiskelijalle vaikeimpia, harjoitellaan enemmän.
- kirjanpito eri opiskelijoiden osaamistasosta tietokantaan
- toinen käyttäjä Opettaja, joka voisi esim. säätää kertauksen määrää, vaikeutumisen nopeutta
- automaattiset vaikeustaso- ym. asetukset eri luokka-asteille
- eri tasoisten aritmetiikan kokeiden toteutus
- koetulosten tallentaminen tietokantaan
- käyttäjä Opettaja voi antaa käyttäjille Opiskelija arvosanat perustuen harjoittelun aktiivisuuteen ja tuloksiin sekä koetuloksiin

## Ohjelman rakenne
Ohjelmassa on graafinen käyttöliittymä Gui, joka käyttää ohjelmalogiikkaa (yhden) luokan Aritmetiikkakone ilmentymän kautta.

Luokan Aritmetiikkakone ilmentymällä on yksi rajapinnan Arpoja toteuttava luokan Kokonaislukuarpoja ilmentymä, jonka se välitää luokan Laskutoimitustehdas ilmentymälle, jota on Luokan Aritmetiikkakone ilmentymällä myös on yksi kappale.

Luokan Aritmetiikkakone ilmentymällä voi luoda luokan Aritmetiikanharjoitus ilmentymiä (0...* kpl / ohjelman suoritus).

Luokan Aritmetiikanharjoitus ilmentymään kuuluu 10 luokan Tehtava ilmentymää. Luokan Tehtava ilmentymää käytetään tekstuaalisen tehtävänannon (esim. "Laske 3+1") luomiseen.

Luokan Tehtava ilmentymään kuuluu 1 luokan Laskutoimitus ilmentymä, joka koostuu kahdesta rajapinnan Operandi toteuttavan luokan ilmentymästä. Operandit voivat olla kokonaislukuja tai toisia laskutoimituksia. Tällaisen "alilaskutoimituksen" operandit ovat aina kokonaislukuja.

