Среда разработки - Eclipse IDE 21. Для начала разработки нужно установить старую версию java jre 1.8, чтобы версия gradle 2.6 могла поддерживаться для работы с версией 1.7.10.

Также нужно указать в PATH JAVA_HOME папку bin с версией java и обязательно jre 1.8, так как при сборке будет ошибка. 

Чтобы указать версию gradle, нужно открыть файл со свойствами forge-1.7.10-10.13.4.1614-1.7.10-src\gradle\wrapper\graddle.wrapper.properties, написать в строке distributionUrl=https\://services.gradle.org/distributions/gradle-2.6-bin.zip

После этого в командной строке и в директории модификации надо прописать gradlew.bat setupDecompWorkspace eclipse, если среда разработки является IntelliJ IDEA, то вместо eclipse заменить idea.

Затем в eclipse нужно указать версию java в настройках. Чтобы проверить модификацию, в конфигурациях debug необходимо создать новую конфигурацию с главным классом GradleStart.


forge-1.7.10-10.13.4.1614-1.7.10-src - главная папка для рабочей среды
forge-1.7.10-10.13.4.1614-1.7.10-src\build\libs - jar файлы с версиями
forge-1.7.10-10.13.4.1614-1.7.10-src\gradle\wrapper - файлы gradle.wrapper, с указанием версии gradle
forge-1.7.10-10.13.4.1614-1.7.10-src\saves - сохраненные миры
forge-1.7.10-10.13.4.1614-1.7.10-src\src\main - основные ассеты модификации, текстуры, классы, файлы анимаций и файлы локализации
forge-1.7.10-10.13.4.1614-1.7.10-src\build.gradle - файл сборки gradle
forge-1.7.10-10.13.4.1614-1.7.10-src\gradlew.bat - скрипт выполнения сборки
forge-1.7.10-10.13.4.1614-1.7.10-src\bin - аналог папки src, но содержимое будет в jar файлах.


Главный пакет - com.scripterae03.diplomka
Главный класс - BaseDiplomka.java

Armorz - общий класс кастомной брони
Baursak - класс предмета "баурсак"
Besh - класс предмета "бешбармак"
BigBread - класс предмета "большой хлеб"
BlockHere - класс блока Шага
BlockHereSides - класс блока Шага(разносторонняя текстура)
BlockOfRandomItemFromMyModLevel1 - класс блока случайного предмета из моей модификации 1 уровня
BlockOfRandomItemFromMyModLevel2 - класс блока случайного предмета из моей модификации 2 уровня
BossEntity - класс сущности "Обсидиановый Страж"
ClientProxy - класс прокси для клиента, который рендерит мир
CommonProxy - класс прокси сервера
CompressedEarthBlock - класс блока сжатой земли
ContainerWorkSurface - класс контейнера кастомного верстака
COOBlockGenerator - класс генератора блока "руда кристаллизованного обсидиана"
CraftingHandler - класс обработчика крафтов кастомного верстака
CrysstalizedObsidian - класс предмета "кристаллизованный обсидиан"
CrysstalizedObsidianBlock - класс блока "крисстализованный обсидиановый блок"
CrysstalizedObsidianOre - класс блока "руда кристаллизованного обсидиана"
EntitySummoner - класс предмета "призыватель обсидианового стража"
EntitySummonerCraftEvent - класс события для достижения "Что будет если на него нажать?"
EventsForge - класс игровых событий
ForgedHandle - класс предмета "закаленная обсидианом рукоять"
GuiHandler - класс обработчика GUI
HandleForSpear - класс предмета "рукоять для копья воды и лавы"
HoeCraftEvent - класс события для достижения "Ты психопат"
IspechennoeNechto - класс блока "испеченное нечто"
KumysAchievementEvent - класс события для достижения "Необузданная Мощь"
KumysBucket - класс предмета "кумыс"
MilkChocolate - класс предмета "шоколад"
MilkChocolatePie - класс предмета "шоколадный пирог"
MiskaRis - класс предмета "миска риса"
Muka - класс предмета "мука"
MukaBlock - класс блока "блок муки"
ObsiBench - класс блока "обсидиановый вестак"
ObsiBenchGUISurface - класс с GUI для кастомного верстака
ObsidianForgedDiamond - класс предмета "закаленный обсидианом алмаз"
ObsidianForgedDiamondBlock - класс блока "закаленный обсидианом алмазный блок"
ObsidianForgedDiamondBrightBlock - класс блока "закаленный обсидианом светящийся алмазный блок"
ObsidianForgedDiamondSword - класс предмета "закаленный обсидианом алмазный меч"
ObsidianForgedAxe - класс предмета "закаленный обсидианом алмазный топор"
ObsidianForgedPickaxe - класс предмета "закаленная обсидианом алмазная кирка"
ObsidianForgedHoe - класс предмета "закаленный обсидианом алмазная мотыга"
ObsidianForgedSpade - класс предмета "закаленный обсидианом алмазная лопата"
OsnovaBaursaka - класс предмета "основа баурсака"
RecipeRemover - класс удаления рецептов для кастомного верстака
RenderBossEntity - класс рендера сущности "Обсидиановый Страж"
SecondCompressedEarthBlock - класс блока "дважды сжатый блок земли"
SpearBlade - класс предмета "клинок для копья воды и лавы"
SpearOfWaterAndLava - класс предмета "копье воды и лавы"
Testo - класс предмета "тесто"
ThirdCompressedEarthBlock - класс блока "трижды сжатый блок земли"
UndoneRis - класс предмета "рис"
WorkSurfaceCraftingManager - класс менеджера крафтов кастомного верстака
WorkSurfaceRecipeSorter - класс сортировки рецептов кастомного верстака
WorkSurfaceShapedRecipes - класс форменного создания кастомного верстака
WorkSurfaceShapelessRecipes - класс бесформенного создания кастомного верстака


en_US.lang - локализация на английском(США)
ru_RU.lang - локализация на русский