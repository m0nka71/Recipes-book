INSERT INTO
    recipe(name, directions, time, ingredients, category_id, img)
VALUES
    ('Pizza', 'W dużej miski wlej wode i dosyp suche drożdże, dokładnie wymieszaj. Dodajemy połowę mąki i
     mieszamy - ciasto powinno być jednolite. Stopniowo dosypujemy pozostałą mąkę i sól. Chwilę ugniatamy
     i odstawiamy na godzinę. Po tym czasie ugniatamy przez 5 minut i odstawiamy w temperaturze pokojowej
     na godzinę, a następnie do lodówki na 18-24 godziny. Na następny dzień ciasto wyjmujemy i dzielimy na 3 równe części,
     tworzymy kulki. Kulki układamy w pojemniku/miscę, przykrywamy i odstawiamy na kolejne 3-4 godziny w tem. pokojowej.
     Po tym czasie mamy gotowe ciasto. Nagrzewamy piekarnik z kamieniem na maksymalną temperaturę. Przygotuj sos i ulubione
     składniki. Pizzę pieczemy 3-5 minut. Smacznego!', '25h', '350g mąki typ 00, 10g soli, 560ml wody, 3g drożdzy suchych', 2, 'pizza.jpg'),
    ('Pad thai', 'Na gorącym woku wrzuć kurczaka. Smaż przez 3 minuty i dodaj warzywa, po 2 minutach dodaj sos.Posyp szczypiorkiem. Smacznego',
     '30min', '300g kurczaka, 1 papryka, 1 cebula, 1 główka czosnku, sos sojowy', 3, 'padthai.jpg'),
    ('Szakszuka', 'Zeszklij cebulę, dodaj czosnek. Po chwili pomidory i duś przez 5 minut. Po tym czasie zrób dziury w sosie
     i do każdej daj jajko. Przykryj minutę. Gotowe', '15min', 'puszka pomidorów, 2 jajka, sól, pieprz', 1, 'szakszuka.jpg'),
    ('Banoffee', 'Do pucharków dodaj pokruszone ciasteczka. Następnie pokrojone banany i masę krówkową. Powtórz warstwy
     na koniec dodaj bitą śmietanę. Smacznego', '15min', '200g ciasteczek, 100ml masy krówkowej, 1 banan, 100ml bitej śmietany', 5, 'banoffee.jpg'),
    ('Frytki z batatów', 'Piekarnik nagrzać do 220 stopni C. Przygotować dużą blachę (np. z wyposażenia piekarnika) i wyłożyć ją papierem do pieczenia.
    Batata obrać i pokroić na cienkie słupki. Obtoczyć je w oliwie, następnie doprawić pieprzem (solimy dopiero na koniec, po upieczeniu), papryką, czosnkiem, oregano. Dodać skrobię ziemniaczaną i wymieszać.
    Bataty ułożyć na blaszce z zachowaniem odstępów. Posypać listkami rozmarynu (opcjonalnie). Wstawić do piekarnika i piec przez ok. 20 - 23 minuty.
    Po upieczeniu posypać posiekaną natką, a przed podaniem doprawić solą.','30min', '1 duży batat (ok. 400 g), 1/2 łyżki oliwy extra
    , po szczypcie pieprzu, papryki oraz czosnku granulowanego, 1/2 łyżeczki suszonego oregano, 1 łyżeczka skrobi ziemniaczanej,
    1 łyżka posiekanej natki pietruszki, sól morska', 4, 'bataty.jpg');

INSERT INTO
    category(type, description, category_img)
VALUES
    ('BREAKFAST', 'Śniadanie to pierwszy i najważniejszy posiłek dnia, który powinien dostarczyć najwięcej energii.
    Tradycyjne polskie śniadanie wielu osobom kojarzy się z chrupiącym i świeżo wypieczonym chlebem
    czy bułkami oraz dodatkami takimi jak jajka, ser, szynka itp.',
    'breakfast.jpg'),
    ('LUNCH', 'Obiad to dla wielu najbardziej wyczekiwany posiłek w ciągu dnia. Bez niego nie wyobrażamy sobie pełnowartościowej diety,
    która powinna być bogata w witaminy i minerały. A ich nigdy nie brakuje w potrawach, które są podstawą dziennego menu.',
     'lunch.jpg'),
    ('DINNER', 'Kolacja – ostatni posiłek wieczorny. Słowo kolacja wywodzi się z języka starołacińskiego od collatio, collationis w znaczeniu zbiórki,
    składki pieniężnej, ale także zebrania, zgromadzenia dostojnych gości na niezwykle uroczystej biesiadzie, uczcie czy wieczerzy.',
     'dinner.jpg'),
    ('SNACK', 'Szybkie przekąski są niezastąpione podczas imprez, takich jak urodziny, imieniny, sylwester czy przyjęcia świąteczne.
    Sprawdzają się także jako małe co nieco do podjadania w ciągu dnia.', 'snack.jpg'),
    ('DESSERT', 'Leniwe popołudnie to jedna z ulubionych pór dnia łasuchów. To właśnie wtedy przychodzi czas
    na długo wyczekiwany po obiedzie deser, który może mieć przecież tak wiele postaci!', 'dessert.jpg');

