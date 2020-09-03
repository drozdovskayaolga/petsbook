package com.example.petsbook.data

import android.content.Context
import com.example.petsbook.R
import com.example.petsbook.data.database.DatabaseDatasource
import com.example.petsbook.data.database.UserEntity
import org.threeten.bp.LocalDate


object OnBoardingRepository {

    // создаю объект незаполненного юзера
    val user = User()

    // создаю функцию для того, чтобы присвоить айди выбранного животного юзеру
    fun setPetId(petId: Int){
        user.petId = petId
    }

    fun setGender(gender: Gender){
        user.gender = gender
    }

    fun setBreedId(breedId: Int){
        user.breedId = breedId
    }

    fun setDOB(dob: LocalDate) {
        user.dob = dob
    }

    fun setPetsName(name: String){
        user.name = name
    }

    fun setEmail(email: String){
        user.email = email
    }

    fun setPassword(password: String){
        user.password = password
    }

    fun registrationFinished(context:Context){
        DatabaseDatasource.getDatabase(context).userDao().insert(UserEntity(petId = user.petId!!, breedId = user.breedId!!,
            gender = user.gender!!, dob = user.dob!!, name = user.name!!, email = user.email!!, password = user.password!!))
    }



    fun getPets (): List<PetsData>{
        val listOfPets = mutableListOf<PetsData>()
        listOfPets.add(
            PetsData(
                "Cat",
                1,
                R.drawable.cat
            )
        )
        listOfPets.add(
            PetsData(
                "Dog",
                2,
                R.drawable.dog
            )
        )
        listOfPets.add(
            PetsData(
                "Fish",
                3,
                R.drawable.fish
            )
        )
        listOfPets.add(
            PetsData(
                "Hamster",
                4,
                R.drawable.hamster
            )
        )
        listOfPets.add(
            PetsData(
                "Guinea Pig",
                5,
                R.drawable.pig
            )
        )
        listOfPets.add(
            PetsData(
                "Parrot",
                6,
                R.drawable.parrot
            )
        )
        listOfPets.add(
            PetsData(
                "Rabbit",
                7,
                R.drawable.rabbit
            )
        )
        listOfPets.add(
            PetsData(
                "Turtle",
                8,
                R.drawable.turtle
            )
        )

        return listOfPets
    }

    fun getBreeds (petId:Int): List<BreedsData>{
        val listOfBreeds = mutableListOf<BreedsData>()
        listOfBreeds.add(
            BreedsData(
                1,
                1,
                "Абиссинская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                2,
                "Австралийская дымчатая"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                3,
                "Азиатская табби"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                4,
                "Американская длинношерстная"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                5,
                "Американская жесткошерстная"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                6,
                "Американская короткошерстная"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                7,
                "Американский бобтейл"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                8,
                "Американский керл"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                9,
                "Анатолийская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                10,
                "Аравийский мау"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                11,
                "Балинезийская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                12,
                "Бамбино"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                13,
                "Бенгальская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                14,
                "Бирманская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                15,
                "Бомбейская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                16,
                "Бразильская короткошерстная кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                17,
                "Британская длинношерстная кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                18,
                "Британская короткошерстная"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                19,
                "Бурманская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                20,
                "Бурмилла"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                21,
                "Гавана браун"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                22,
                "Гималайская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                23,
                "Двэльф"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                24,
                "Девон рекс"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                25,
                "Донской сфинкс"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                26,
                "Европейская короткошерстная"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                27,
                "Египетская мау"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                28,
                "Йоркская шоколадная кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                29,
                "Калифорнийская сияющая кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                30,
                "Канаани"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                31,
                "Канадский сфинкс"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                32,
                "Као-мани"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                33,
                "Каракал"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                34,
                "Карельский бобтейл"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                35,
                "Кимрик"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                36,
                "Корат"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                37,
                "Корниш рекс"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                38,
                "Курильский бобтейл"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                39,
                "Лаперм"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                40,
                "Ликой"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                41,
                "Мандалай"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                42,
                "Манчкин"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                43,
                "Мейн кун"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                44,
                "Меконгский бобтейл"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                45,
                "Минскин"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                46,
                "Мэнск"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                47,
                "Наполеон"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                48,
                "Невская маскарадная кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                49,
                "Немецкий рекс"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                50,
                "Нибелунг"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                51,
                "Норвежская лесная кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                52,
                "Орегон-рекс"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                53,
                "Ориентальная"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                54,
                "Охос азулес"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                55,
                "Оцикет"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                56,
                "Персидская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                57,
                "Петербургский сфинкс"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                58,
                "Пикси-боб"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                59,
                "Рагамаффин"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                60,
                "Русская голубая кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                61,
                "Рэгдолл"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                62,
                "Саванна"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                63,
                "Сейшельская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                64,
                "Селкирк-рекс"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                65,
                "Серенгети"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                66,
                "Сиамская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                67,
                "Сибирская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                68,
                "Сингапурская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                69,
                "Сноу-шу"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                70,
                "Aфриканская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                71,
                "Сомалийская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                72,
                "Тайская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                73,
                "Тойбоб"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                74,
                "Тойгер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                75,
                "Тонкинская"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                76,
                "Турецкая ангора"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                77,
                "Турецкий ван"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                78,
                "Украинский левкой"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                79,
                "Уральский рекс"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                80,
                "Форин Вайт"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                81,
                "Хайленд фолд"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                82,
                "Цейлонская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                83,
                "Чаузи"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                84,
                "Шантильи-тиффани"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                85,
                "Шартрез"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                86,
                "Шотландская вислоухая кошка (Скоттиш фолд)"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                87,
                "Шотландская прямоухая кошка (Скоттиш страйт)"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                88,
                "Эгейская кошка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                89,
                "Экзотическая короткошерстная"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                90,
                "Эльф"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                91,
                "Яванез (яванская кошка)"

            )
        )
        listOfBreeds.add(
            BreedsData(
                1,
                92,
                "Японский бобтейл"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                93,
                "Австралийская короткохвостая пастушья собака"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                94,
                "Австралийская овчарка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                95,
                "Австралийская пастушья собака"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                96,
                "Австралийский келпи"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                97,
                "Австралийский терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                98,
                "Австралийский шелковистый терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                99,
                "Австрийская гончая"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                100,
                "Австрийский брудастый бракк"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                101,
                "Австрийский пинчер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                102,
                "Азавак"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                103,
                "Азорская пастушья собака"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                104,
                "Аиди"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                105,
                "Акита-ину"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                106,
                "Алано"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                107,
                "Алопекис"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                108,
                "Альпийская таксообразная гончая"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                109,
                "Аляскинский кли-кай"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                110,
                "Аляскинский маламут"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                111,
                "Американская акита"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                112,
                "Американская эскимосская собака"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                113,
                "Американский бандог"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                114,
                "Американский булли"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                115,
                "Американский бульдог"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                116,
                "Американский водяной спаниель"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                117,
                "Американский голый терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                118,
                "Американский кокер-спаниель"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                119,
                "Американский мастиф"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                120,
                "Американский питбультерьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                121,
                "Американский стаффордширский терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                122,
                "Американский фоксхаунд"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                123,
                "Анатолийская овчарка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                124,
                "Английская енотовая гончая"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                125,
                "Английская овчарка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                126,
                "Английский бульдог"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                127,
                "Английский кокер-спаниель"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                128,
                "Английский мастиф"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                129,
                "Английский пойнтер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                130,
                "Английский сеттер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                131,
                "Английский спрингер-спаниель"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                132,
                "Английский той-терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                133,
                "Английский фоксхаунд"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                134,
                "Аппенцеллер зенненхунд"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                135,
                "Аргентинский дог"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                136,
                "Артуазская гончая"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                137,
                "Афганская борзая"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                138,
                "Африканис"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                139,
                "Аффенпинчер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                140,
                "Баварская горная гончая"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                141,
                "Бакхмуль"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                142,
                "Барбет"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                143,
                "Басенджи"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                144,
                "Баскская овчарка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                145,
                "Бассет-хаунд"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                146,
                "Бедлингтон-терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                147,
                "Белая швейцарская овчарка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                148,
                "Бельгийская овчарка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                149,
                "Бельгийский гриффон"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                150,
                "Бергамская овчарка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                151,
                "Бернская гончая"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                152,
                "Бернский зенненхунд"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                153,
                "Бивер-йоркширский терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                154,
                "Бигль"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                155,
                "Бишон фризе"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                156,
                "Бладхаунд"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                157,
                "Блю-лейси"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                158,
                "Бобтейл"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                159,
                "Болгарский барак"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                160,
                "Болоньез"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                161,
                "Большой вандейский бассет-гриффон"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                162,
                "Большой вандейский гриффон"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                163,
                "Большой мюнстерлендер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                164,
                "Большой швейцарский зенненхунд"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                165,
                "Бордер-колли"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                166,
                "Бордер-терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                167,
                "Бордоский дог"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                168,
                "Бородатый колли"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                169,
                "Босерон"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                170,
                "Бостон-терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                171,
                "Бразильский терьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                172,
                "Бразильский фила"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                173,
                "Бретонский эпаньоль"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                174,
                "Бриар"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                175,
                "Брохольмер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                176,
                "Брюссельский гриффон"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                177,
                "Буковинская овчарка"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                178,
                "Бульдог кампейро"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                179,
                "Бульдог Катахулы"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                180,
                "Бульмастиф"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                181,
                "Бультерьер"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                182,
                "Бурбонский бракк"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                183,
                "Бурбуль"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                184,
                "Бурят-монгольский волкодав"

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                185,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                186,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                187,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                188,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                189,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                190,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                191,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                192,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                193,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                194,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                195,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                196,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                197,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                198,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                199,
                ""

            )
        )
        listOfBreeds.add(
            BreedsData(
                2,
                200,
                ""

            )
        )


        return listOfBreeds.filter { it.petId == petId }
    }
}