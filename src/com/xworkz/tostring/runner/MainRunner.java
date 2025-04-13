package com.xworkz.tostring.runner;
import com.xworkz.tostring.inner.*;

public class MainRunner {
    public static void main(String[] args) {


        AeroGrid aeroGrid = new AeroGrid("High-Performance", 800, true);
        System.out.println(aeroGrid);
        System.out.println("hashCode: " + aeroGrid.hashCode());
        AeroGrid anotherAeroGrid = new AeroGrid("High-Performance", 800, true);
        System.out.println("equals: " + aeroGrid.equals(anotherAeroGrid));

        AirConditioner airConditioner = new AirConditioner("Cooling", 1200, true);
        System.out.println(airConditioner);
        System.out.println("hashCode: " + airConditioner.hashCode());
        AirConditioner anotherAirConditioner = new AirConditioner("Cooling", 1200, true);
        System.out.println("equals: " + airConditioner.equals(anotherAirConditioner));

        AlarmClock alarmClock = new AlarmClock("Digital", 8, true);
        System.out.println(alarmClock);
        System.out.println("hashCode: " + alarmClock.hashCode());
        AlarmClock anotherAlarmClock = new AlarmClock("Digital", 8, true);
        System.out.println("equals: " + alarmClock.equals(anotherAlarmClock));

        AstroScope astroScope = new AstroScope("High-Magnification", 400, false);
        System.out.println(astroScope);
        System.out.println("hashCode: " + astroScope.hashCode());
        AstroScope anotherAstroScope = new AstroScope("High-Magnification", 400, false);
        System.out.println("equals: " + astroScope.equals(anotherAstroScope));

        Backpack backpack = new Backpack("Travel", 30, true);
=======


                Backpack backpack = new Backpack("Nylon", 1, true);
                System.out.println(backpack);
                System.out.println(backpack.hashCode());
                System.out.println("Original: " + System.identityHashCode(backpack));
                System.out.println("*");

                Bag bag = new Bag("Leather", 2, true);
                System.out.println(bag);
                System.out.println(bag.hashCode());
                System.out.println("Original: " + System.identityHashCode(bag));
                System.out.println("*");

                Bed bed = new Bed("Wooden", 3, true);
                System.out.println(bed);
                System.out.println(bed.hashCode());
                System.out.println("Original: " + System.identityHashCode(bed));
                System.out.println("*");

                Bicycle bicycle = new Bicycle("Hero", 4, true);
                System.out.println(bicycle);
                System.out.println(bicycle.hashCode());
                System.out.println("Original: " + System.identityHashCode(bicycle));
                System.out.println("*");

                Book book = new Book("Java", 5, true);
                System.out.println(book);
                System.out.println(book.hashCode());
                System.out.println("Original: " + System.identityHashCode(book));
                System.out.println("*");

                Bottle bottle = new Bottle("Steel", 6, true);
                System.out.println(bottle);
                System.out.println(bottle.hashCode());
                System.out.println("Original: " + System.identityHashCode(bottle));
                System.out.println("*");

                Bulb bulb = new Bulb("LED", 7, true);
                System.out.println(bulb);
                System.out.println(bulb.hashCode());
                System.out.println("Original: " + System.identityHashCode(bulb));
                System.out.println("*");

                Calculator calculator = new Calculator("Casio", 8, true);
                System.out.println(calculator);
                System.out.println(calculator.hashCode());
                System.out.println("Original: " + System.identityHashCode(calculator));
                System.out.println("*");

                Camera camera = new Camera("Canon", 9, true);
                System.out.println(camera);
                System.out.println(camera.hashCode());
                System.out.println("Original: " + System.identityHashCode(camera));
                System.out.println("*");

                Car car = new Car("Toyota", 10, true);
                System.out.println(car);
                System.out.println(car.hashCode());
                System.out.println("Original: " + System.identityHashCode(car));
                System.out.println("*");

                Chair chair = new Chair("Plastic", 11, true);
                System.out.println(chair);
                System.out.println(chair.hashCode());
                System.out.println("Original: " + System.identityHashCode(chair));
                System.out.println("*");

                Charger charger = new Charger("Samsung", 12, true);
                System.out.println(charger);
                System.out.println(charger.hashCode());
                System.out.println("Original: " + System.identityHashCode(charger));
                System.out.println("*");

                Clipboard clipboard = new Clipboard("Board", 13, true);
                System.out.println(clipboard);
                System.out.println(clipboard.hashCode());
                System.out.println("Original: " + System.identityHashCode(clipboard));
                System.out.println("*");

                Clock clock = new Clock("Analog", 14, true);
                System.out.println(clock);
                System.out.println(clock.hashCode());
                System.out.println("Original: " + System.identityHashCode(clock));
                System.out.println("*");

                Comb comb = new Comb("FineTooth", 15, true);
                System.out.println(comb);
                System.out.println(comb.hashCode());
                System.out.println("Original: " + System.identityHashCode(comb));
                System.out.println("*");

                Curtain curtain = new Curtain("Cotton", 16, true);
                System.out.println(curtain);
                System.out.println(curtain.hashCode());
                System.out.println("Original: " + System.identityHashCode(curtain));
                System.out.println("*");

                Cushion cushion = new Cushion("Soft", 17, true);
                System.out.println(cushion);
                System.out.println(cushion.hashCode());
                System.out.println("Original: " + System.identityHashCode(cushion));
                System.out.println("*");

                Door door = new Door("Main", 18, true);
                System.out.println(door);
                System.out.println(door.hashCode());
                System.out.println("Original: " + System.identityHashCode(door));
                System.out.println("*");

                DrawingTablet drawingTablet = new DrawingTablet("XP-Pen", 19, true);
                System.out.println(drawingTablet);
                System.out.println(drawingTablet.hashCode());
                System.out.println("Original: " + System.identityHashCode(drawingTablet));
                System.out.println("*");

                Drone drone = new Drone("DJI", 20, true);
                System.out.println(drone);
                System.out.println(drone.hashCode());
                System.out.println("Original: " + System.identityHashCode(drone));
                System.out.println("*");

                Earbuds earbuds = new Earbuds("Boat", 21, true);
                System.out.println(earbuds);
                System.out.println(earbuds.hashCode());
                System.out.println("Original: " + System.identityHashCode(earbuds));
                System.out.println("*");

                Fan fan = new Fan("Crompton", 22, true);
                System.out.println(fan);
                System.out.println(fan.hashCode());
                System.out.println("Original: " + System.identityHashCode(fan));
                System.out.println("*");

                FlashDrive flashDrive = new FlashDrive("SanDisk", 23, true);
                System.out.println(flashDrive);
                System.out.println(flashDrive.hashCode());
                System.out.println("Original: " + System.identityHashCode(flashDrive));
                System.out.println("*");

                Fridge fridge = new Fridge("LG", 24, true);
                System.out.println(fridge);
                System.out.println(fridge.hashCode());
                System.out.println("Original: " + System.identityHashCode(fridge));
                System.out.println("*");

                Gamepad gamepad = new Gamepad("Sony", 25, true);
                System.out.println(gamepad);
                System.out.println(gamepad.hashCode());
                System.out.println("Original: " + System.identityHashCode(gamepad));
                System.out.println("*");

                Glasses glasses = new Glasses("RayBan", 26, true);
                System.out.println(glasses);
                System.out.println(glasses.hashCode());
                System.out.println("Original: " + System.identityHashCode(glasses));
                System.out.println("*");

                Globe globe = new Globe("World", 27, true);
                System.out.println(globe);
                System.out.println(globe.hashCode());
                System.out.println("Original: " + System.identityHashCode(globe));
                System.out.println("*");

                GraphicsCard graphicsCard = new GraphicsCard("NVIDIA", 28, true);
                System.out.println(graphicsCard);
                System.out.println(graphicsCard.hashCode());
                System.out.println("Original: " + System.identityHashCode(graphicsCard));
                System.out.println("*");

                Headphones headphones = new Headphones("JBL", 29, true);
                System.out.println(headphones);
                System.out.println(headphones.hashCode());
                System.out.println("Original: " + System.identityHashCode(headphones));
                System.out.println("*");

                Helmet helmet = new Helmet("Vega", 30, true);
                System.out.println(helmet);
                System.out.println(helmet.hashCode());
                System.out.println("Original: " + System.identityHashCode(helmet));
                System.out.println("*");

                Highlighter highlighter = new Highlighter("Yellow", 31, true);
                System.out.println(highlighter);
                System.out.println(highlighter.hashCode());
                System.out.println("Original: " + System.identityHashCode(highlighter));
                System.out.println("*");

                Joystick joystick = new Joystick("Logitech", 32, true);
                System.out.println(joystick);
                System.out.println(joystick.hashCode());
                System.out.println("Original: " + System.identityHashCode(joystick));
                System.out.println("*");

                Keyboard keyboard = new Keyboard("Mechanical", 33, true);
                System.out.println(keyboard);
                System.out.println(keyboard.hashCode());
                System.out.println("Original: " + System.identityHashCode(keyboard));
                System.out.println("*");

                Keychain keychain = new Keychain("Metal", 34, true);
                System.out.println(keychain);
                System.out.println(keychain.hashCode());
                System.out.println("Original: " + System.identityHashCode(keychain));
                System.out.println("*");

                Laptop laptop = new Laptop("HP", 35, true);
                System.out.println(laptop);
                System.out.println(laptop.hashCode());
                System.out.println("Original: " + System.identityHashCode(laptop));
                System.out.println("*");

                LunchBox lunchBox = new LunchBox("Steel", 36, true);
                System.out.println(lunchBox);
                System.out.println(lunchBox.hashCode());
                System.out.println("Original: " + System.identityHashCode(lunchBox));
                System.out.println("*");

                Marker marker = new Marker("Whiteboard", 37, true);
                System.out.println(marker);
                System.out.println(marker.hashCode());
                System.out.println("Original: " + System.identityHashCode(marker));
                System.out.println("*");

                Mattress mattress = new Mattress("Foam", 38, true);
                System.out.println(mattress);
                System.out.println(mattress.hashCode());
                System.out.println("Original: " + System.identityHashCode(mattress));
                System.out.println("*");

                Microphone microphone = new Microphone("Blue Yeti", 39, true);
                System.out.println(microphone);
                System.out.println(microphone.hashCode());
                System.out.println("Original: " + System.identityHashCode(microphone));
                System.out.println("*");

                Microscope microscope = new Microscope("Olympus", 40, true);
                System.out.println(microscope);
                System.out.println(microscope.hashCode());
                System.out.println("Original: " + System.identityHashCode(microscope));
                System.out.println("*");

                Microwave microwave = new Microwave("Samsung", 41, true);
                System.out.println(microwave);
                System.out.println(microwave.hashCode());
                System.out.println("Original: " + System.identityHashCode(microwave));
                System.out.println("*");

                Mirror mirror = new Mirror("Glass", 42, true);
                System.out.println(mirror);
                System.out.println(mirror.hashCode());
                System.out.println("Original: " + System.identityHashCode(mirror));
                System.out.println("*");

                MirrorStand mirrorStand = new MirrorStand("Wood", 43, true);
                System.out.println(mirrorStand);
                System.out.println(mirrorStand.hashCode());
                System.out.println("Original: " + System.identityHashCode(mirrorStand));
                System.out.println("*");

                Mobile mobile = new Mobile("Samsung", 44, true);
                System.out.println(mobile);
                System.out.println(mobile.hashCode());
                System.out.println("Original: " + System.identityHashCode(mobile));
                System.out.println("*");

                Mouse mouse = new Mouse("Logitech", 45, true);
                System.out.println(mouse);
                System.out.println(mouse.hashCode());
                System.out.println("Original: " + System.identityHashCode(mouse));
                System.out.println("*");

                MousePad mousePad = new MousePad("Rubber", 46, true);
                System.out.println(mousePad);
                System.out.println(mousePad.hashCode());
                System.out.println("Original: " + System.identityHashCode(mousePad));
                System.out.println("*");

                NailCutter nailCutter = new NailCutter("Steel", 47, true);
                System.out.println(nailCutter);
                System.out.println(nailCutter.hashCode());
                System.out.println("Original: " + System.identityHashCode(nailCutter));
                System.out.println("*");

                Notebook notebook = new Notebook("Classmate", 48, true);
                System.out.println(notebook);
                System.out.println(notebook.hashCode());
                System.out.println("Original: " + System.identityHashCode(notebook));
                System.out.println("*");

                Pen pen = new Pen("Pilot", 49, true);
                System.out.println(pen);
                System.out.println(pen.hashCode());
                System.out.println("Original: " + System.identityHashCode(pen));
                System.out.println("*");

                PencilBox pencilBox = new PencilBox("Plastic", 50, true);
                System.out.println(pencilBox);
                System.out.println(pencilBox.hashCode());
                System.out.println("Original: " + System.identityHashCode(pencilBox));
                System.out.println("*");

                Pillow pillow = new Pillow("Cotton", 51, true);
                System.out.println(pillow);
                System.out.println(pillow.hashCode());
                System.out.println("Original: " + System.identityHashCode(pillow));
                System.out.println("*");

                Plate plate = new Plate("Steel", 52, true);
                System.out.println(plate);
                System.out.println(plate.hashCode());
                System.out.println("Original: " + System.identityHashCode(plate));
                System.out.println("*");

                PowerBank powerBank = new PowerBank("Mi", 53, true);
                System.out.println(powerBank);
                System.out.println(powerBank.hashCode());
                System.out.println("Original: " + System.identityHashCode(powerBank));
                System.out.println("*");

                Printer printer = new Printer("HP", 54, true);
                System.out.println(printer);
                System.out.println(printer.hashCode());
                System.out.println("Original: " + System.identityHashCode(printer));
                System.out.println("*");

                Projector projector = new Projector("Epson", 55, true);
                System.out.println(projector);
                System.out.println(projector.hashCode());
                System.out.println("Original: " + System.identityHashCode(projector));
                System.out.println("*");

                Refrigerator refrigerator = new Refrigerator("Whirlpool", 56, true);
                System.out.println(refrigerator);
                System.out.println(refrigerator.hashCode());
                System.out.println("Original: " + System.identityHashCode(refrigerator));
                System.out.println("*");

                Remote remote = new Remote("Sony", 57, true);
                System.out.println(remote);
                System.out.println(remote.hashCode());
                System.out.println("Original: " + System.identityHashCode(remote));
                System.out.println("*");

                RingLight ringLight = new RingLight("LED", 58, true);
                System.out.println(ringLight);
                System.out.println(ringLight.hashCode());
                System.out.println("Original: " + System.identityHashCode(ringLight));
                System.out.println("*");

                Router router = new Router("TP-Link", 59, true);
                System.out.println(router);
                System.out.println(router.hashCode());
                System.out.println("Original: " + System.identityHashCode(router));
                System.out.println("*");

                Scanner scanner = new Scanner("Canon", 60, true);
                System.out.println(scanner);
                System.out.println(scanner.hashCode());
                System.out.println("Original: " + System.identityHashCode(scanner));
                System.out.println("*");

                Screwdriver screwdriver = new Screwdriver("Phillips", 61, true);
                System.out.println(screwdriver);
                System.out.println(screwdriver.hashCode());
                System.out.println("Original: " + System.identityHashCode(screwdriver));
                System.out.println("*");

                SelfieStick selfieStick = new SelfieStick("Aluminum", 62, true);
                System.out.println(selfieStick);
                System.out.println(selfieStick.hashCode());
                System.out.println("Original: " + System.identityHashCode(selfieStick));
                System.out.println("*");

                Shoes shoes = new Shoes("Nike", 63, true);
                System.out.println(shoes);
                System.out.println(shoes.hashCode());
                System.out.println("Original: " + System.identityHashCode(shoes));
                System.out.println("*");

                Skateboard skateboard = new Skateboard("Wood", 64, true);
                System.out.println(skateboard);
                System.out.println(skateboard.hashCode());
                System.out.println("Original: " + System.identityHashCode(skateboard));
                System.out.println("*");

                Smartwatch smartwatch = new Smartwatch("Apple", 65, true);
                System.out.println(smartwatch);
                System.out.println(smartwatch.hashCode());
                System.out.println("Original: " + System.identityHashCode(smartwatch));
                System.out.println("*");

                Sofa sofa = new Sofa("Leather", 66, true);
                System.out.println(sofa);
                System.out.println(sofa.hashCode());
                System.out.println("Original: " + System.identityHashCode(sofa));
                System.out.println("*");

                Speaker speaker = new Speaker("JBL", 67, true);
                System.out.println(speaker);
                System.out.println(speaker.hashCode());
                System.out.println("Original: " + System.identityHashCode(speaker));
                System.out.println("*");

                Stapler stapler = new Stapler("Kangaro", 68, true);
                System.out.println(stapler);
                System.out.println(stapler.hashCode());
                System.out.println("Original: " + System.identityHashCode(stapler));
                System.out.println("*");

                Sunglasses sunglasses = new Sunglasses("RayBan", 69, true);
                System.out.println(sunglasses);
                System.out.println(sunglasses.hashCode());
                System.out.println("Original: " + System.identityHashCode(sunglasses));
                System.out.println("*");

                Table table = new Table("Wood", 70, true);
                System.out.println(table);
                System.out.println(table.hashCode());
                System.out.println("Original: " + System.identityHashCode(table));
                System.out.println("*");

                Television television = new Television("Sony", 71, true);
                System.out.println(television);
                System.out.println(television.hashCode());
                System.out.println("Original: " + System.identityHashCode(television));
                System.out.println("*");

                Thermometer thermometer = new Thermometer("Digital", 72, true);
                System.out.println(thermometer);
                System.out.println(thermometer.hashCode());
                System.out.println("Original: " + System.identityHashCode(thermometer));
                System.out.println("*");

                Toothbrush toothbrush = new Toothbrush("OralB", 73, true);
                System.out.println(toothbrush);
                System.out.println(toothbrush.hashCode());
                System.out.println("Original: " + System.identityHashCode(toothbrush));
                System.out.println("*");

                Towel towel = new Towel("Cotton", 74, true);
                System.out.println(towel);
                System.out.println(towel.hashCode());
                System.out.println("Original: " + System.identityHashCode(towel));
                System.out.println("*");

                Tripod tripod = new Tripod("Aluminum", 75, true);
                System.out.println(tripod);
                System.out.println(tripod.hashCode());
                System.out.println("Original: " + System.identityHashCode(tripod));
                System.out.println("*");

                Wallet wallet = new Wallet("Leather", 76, true);
                System.out.println(wallet);
                System.out.println(wallet.hashCode());
                System.out.println("Original: " + System.identityHashCode(wallet));
                System.out.println("*");

                WashingMachine washingMachine = new WashingMachine("LG", 77, true);
                System.out.println(washingMachine);
                System.out.println(washingMachine.hashCode());
                System.out.println("Original: " + System.identityHashCode(washingMachine));
                System.out.println("*");

                Watch watch = new Watch("Fossil", 78, true);
                System.out.println(watch);
                System.out.println(watch.hashCode());
                System.out.println("Original: " + System.identityHashCode(watch));
                System.out.println("*");

                WaterBottle waterBottle = new WaterBottle("Steel", 79, true);
                System.out.println(waterBottle);
                System.out.println(waterBottle.hashCode());
                System.out.println("Original: " + System.identityHashCode(waterBottle));
                System.out.println("*");

                Whiteboard whiteboard = new Whiteboard("Magnetic", 80, true);
                System.out.println(whiteboard);
                System.out.println(whiteboard.hashCode());
                System.out.println("Original: " + System.identityHashCode(whiteboard));
                System.out.println("*");

                Wrench wrench = new Wrench("Box-end", 81, true);
                System.out.println(wrench);
                System.out.println(wrench.hashCode());
                System.out.println("Original: " + System.identityHashCode(wrench));
                System.out.println("*");

                AstroScope astroScope = new AstroScope("Horoscope", 12, false);
                System.out.println(astroScope);
                System.out.println(astroScope.hashCode());
                System.out.println("Original: " + System.identityHashCode(astroScope));
                System.out.println("*");

                NeonBlaster neonBlaster = new NeonBlaster("Laser", 5, true);
                System.out.println(neonBlaster);
                System.out.println(neonBlaster.hashCode());
                System.out.println("Original: " + System.identityHashCode(neonBlaster));
                System.out.println("*");

                QuantumMat quantumMat = new QuantumMat("Quantum", 1, false);
                System.out.println(quantumMat);
                System.out.println(quantumMat.hashCode());
                System.out.println("Original: " + System.identityHashCode(quantumMat));
                System.out.println("*");

                ZenPulse zenPulse = new ZenPulse("Meditation", 9, true);
                System.out.println(zenPulse);
                System.out.println(zenPulse.hashCode());
                System.out.println("Original: " + System.identityHashCode(zenPulse));
                System.out.println("*");

                FrostLink frostLink = new FrostLink("IceMode", 7, false);
                System.out.println(frostLink);
                System.out.println(frostLink.hashCode());
                System.out.println("Original: " + System.identityHashCode(frostLink));
                System.out.println("*");

                EchoTrek echoTrek = new EchoTrek("EchoSound", 3, true);
                System.out.println(echoTrek);
                System.out.println(echoTrek.hashCode());
                System.out.println("Original: " + System.identityHashCode(echoTrek));
                System.out.println("*");

                VortexShield vortexShield = new VortexShield("Shield", 10, true);
                System.out.println(vortexShield);
                System.out.println(vortexShield.hashCode());
                System.out.println("Original: " + System.identityHashCode(vortexShield));
                System.out.println("*");

                SolarNest solarNest = new SolarNest("Solar", 24, false);
                System.out.println(solarNest);
                System.out.println(solarNest.hashCode());
                System.out.println("Original: " + System.identityHashCode(solarNest));
                System.out.println("*");

                PixelDrone pixelDrone = new PixelDrone("Camera", 4, true);
                System.out.println(pixelDrone);
                System.out.println(pixelDrone.hashCode());
                System.out.println("Original: " + System.identityHashCode(pixelDrone));
                System.out.println("*");

                LavaTrack lavaTrack = new LavaTrack("Magma", 6, false);
                System.out.println(lavaTrack);
                System.out.println(lavaTrack.hashCode());
                System.out.println("Original: " + System.identityHashCode(lavaTrack));
                System.out.println("*");

                NanoForge nanoForge = new NanoForge("NanoPower", 11, true);
                System.out.println(nanoForge);
                System.out.println(nanoForge.hashCode());
                System.out.println("Original: " + System.identityHashCode(nanoForge));
                System.out.println("*");

                CrystalTune crystalTune = new CrystalTune("TuneSync", 8, false);
                System.out.println(crystalTune);
                System.out.println(crystalTune.hashCode());
                System.out.println("Original: " + System.identityHashCode(crystalTune));
                System.out.println("*");

                AeroGrid aeroGrid = new AeroGrid("FlightGrid", 15, true);
                System.out.println(aeroGrid);
                System.out.println(aeroGrid.hashCode());
                System.out.println("Original: " + System.identityHashCode(aeroGrid));
                System.out.println("*");

                BioSynth bioSynth = new BioSynth("BioCore", 13, true);
                System.out.println(bioSynth);
                System.out.println(bioSynth.hashCode());
                System.out.println("Original: " + System.identityHashCode(bioSynth));
                System.out.println("*");

                LumenBox lumenBox = new LumenBox("LightBox", 16, false);
                System.out.println(lumenBox);
                System.out.println(lumenBox.hashCode());
                System.out.println("Original: " + System.identityHashCode(lumenBox));
                System.out.println("*");

                OmegaLens omegaLens = new OmegaLens("LensTech", 21, true);
                System.out.println(omegaLens);
                System.out.println(omegaLens.hashCode());
                System.out.println("Original: " + System.identityHashCode(omegaLens));
                System.out.println("*");

                GliderSync gliderSync = new GliderSync("GlideMode", 18, false);
                System.out.println(gliderSync);
                System.out.println(gliderSync.hashCode());
                System.out.println("Original: " + System.identityHashCode(gliderSync));
                System.out.println("*");

                CyberNest cyberNest = new CyberNest("AI Nest", 20, true);
                System.out.println(cyberNest);
                System.out.println(cyberNest.hashCode());
                System.out.println("Original: " + System.identityHashCode(cyberNest));
                System.out.println("*");

                InfernoDeck infernoDeck = new InfernoDeck("FlameBoost", 17, true);
                System.out.println(infernoDeck);
                System.out.println(infernoDeck.hashCode());
                System.out.println("Original: " + System.identityHashCode(infernoDeck));
                System.out.println("*");
            }
        }

        Backpack backpack = new Backpack("Nylon", 30, true);
        Bag bag = new Bag("Leather", 25, false);
        Bed bed = new Bed("Queen", "Wood", 20000.0);
        Bicycle bicycle = new Bicycle("Hero", 26, "Mountain");
        Book book = new Book("Java", "James Gosling", 599.0);
        Bottle bottle = new Bottle("Steel", 1, true);
        Bulb bulb = new Bulb("LED", 15, 7.0);
        Calculator calculator = new Calculator("Casio", true, "Scientific");
        Camera camera = new Camera("Canon", 24.2, true);
        Car car = new Car("Toyota", "Innova", 2000000.0);
        Chair chair = new Chair("Plastic", 4.5, false);
        Charger charger = new Charger("Samsung", "Type-C", 25);
        Clipboard clipboard = new Clipboard("A4", "Brown", true);
        Clock clock = new Clock("Wall", "White", true);
        Comb comb = new Comb("Plastic", "Black", 20.0);
        Curtain curtain = new Curtain("Cotton", "Blue", 5.5);
        Cushion cushion = new Cushion("Round", "Red", 3.0);
        Door door = new Door("Wood", "Brown", true);
        DrawingTablet drawingTablet = new DrawingTablet("XP-Pen", 10, true);
        Drone drone = new Drone("DJI", 4, true);
        Earbuds earbuds = new Earbuds("Boat", true, 20);
        Fan fan = new Fan("Crompton", 3, 1200.0);
        FlashDrive flashDrive = new FlashDrive("SanDisk", 64, "USB 3.0");
        Fridge fridge = new Fridge("LG", 300, "Double Door");
        Gamepad gamepad = new Gamepad("Sony", true, "Wireless");
        Glasses glasses = new Glasses("RayBan", "Black", false);
        Globe globe = new Globe("Plastic", 12, "World");
        GraphicsCard graphicsCard = new GraphicsCard("NVIDIA", 8, "RTX 3060");
        Headphones headphones = new Headphones("JBL", true, "Over-Ear");
        Helmet helmet = new Helmet("Vega", "Black", true);
        Highlighter highlighter = new Highlighter("Yellow", "Faber-Castell", true);
        Joystick joystick = new Joystick("Logitech", 2, true);
        Keyboard keyboard = new Keyboard("Mechanical", true, "RGB");
        Keychain keychain = new Keychain("Metal", "Silver", 3.5);
        Laptop laptop = new Laptop("HP", "i5", 8);
        LunchBox lunchBox = new LunchBox("Steel", 2, true);
        Marker marker = new Marker("Whiteboard", "Blue", true);
        Mattress mattress = new Mattress("Foam", "Double", 10000.0);
        Microphone microphone = new Microphone("Blue Yeti", true, "USB");
        Microscope microscope = new Microscope("Olympus", 100, true);
        Microwave microwave = new Microwave("Samsung", 30, true);
        Mirror mirror = new Mirror("Glass", "Oval", false);
        MirrorStand mirrorStand = new MirrorStand("Wood", 5.5, true);
        Mobile mobile = new Mobile("Samsung", "Android", 6.5);
        Mouse mouse = new Mouse("Logitech", true, "Wireless");
        MousePad mousePad = new MousePad("Rubber", "Black", true);
        NailCutter nailCutter = new NailCutter("Steel", 2.5, true);
        Notebook notebook = new Notebook("Classmate", 200, true);
        Pen pen = new Pen("Pilot", "Blue", 14);
        PencilBox pencilBox = new PencilBox("Plastic", "Red", 3);
        Pillow pillow = new Pillow("Cotton", "White", 4);
        Plate plate = new Plate("Steel", "Round", 1);
        PowerBank powerBank = new PowerBank("Mi", 20000, true);
        Printer printer = new Printer("HP", "Inkjet", true);
        Projector projector = new Projector("Epson", true, "HD");
        Refrigerator refrigerator = new Refrigerator("Whirlpool", 240, 4);
        Remote remote = new Remote("Sony", true, "TV");
        RingLight ringLight = new RingLight("LED", 18, true);
        Router router = new Router("TP-Link", true, "Dual Band");
        Scanner scanner = new Scanner("Canon", true, "Flatbed");
        Screwdriver screwdriver = new Screwdriver("Phillips", 6, false);
        SelfieStick selfieStick = new SelfieStick("Aluminum", true, "Bluetooth");
        Shoes shoes = new Shoes("Nike", 9, "Black");
        Skateboard skateboard = new Skateboard("Wood", 4, "Street");
        Smartwatch smartwatch = new Smartwatch("Apple", true, "Series 6");
        Sofa sofa = new Sofa("Leather", 3, true);
        Speaker speaker = new Speaker("JBL", 20, true);
        Stapler stapler = new Stapler("Kangaro", 20, true);
        Sunglasses sunglasses = new Sunglasses("RayBan", "Black", true);
        Table table = new Table("Wood", 4, true);
        Television television = new Television("Sony", 55, "LED");
        Thermometer thermometer = new Thermometer("Digital", true, "Celsius");
        Toothbrush toothbrush = new Toothbrush("OralB", true, "Soft");
        Towel towel = new Towel("Cotton", "White", 2.0);
        Tripod tripod = new Tripod("Aluminum", 150, true);
        Wallet wallet = new Wallet("Leather", "Brown", true);
        WashingMachine washingMachine = new WashingMachine("LG", 7, true);
        Watch watch = new Watch("Fossil", "Analog", true);
        WaterBottle waterBottle = new WaterBottle("Steel", 1, true);
        Whiteboard whiteboard = new Whiteboard("Magnetic", "White", true);
        Wrench wrench = new Wrench("Box-end", 12, true);
>>>>>>> 82fdd5175d6c058bb5891ccc225197d9efb05c34
        System.out.println(backpack);
        System.out.println("hashCode: " + backpack.hashCode());
        Backpack anotherBackpack = new Backpack("Travel", 30, true);
        System.out.println("equals: " + backpack.equals(anotherBackpack));

        Bag bag = new Bag("Leather", 15, false);
        System.out.println(bag);
        System.out.println("hashCode: " + bag.hashCode());
        Bag anotherBag = new Bag("Leather", 15, false);
        System.out.println("equals: " + bag.equals(anotherBag));

        Bicycle bicycle = new Bicycle("Mountain", 21, true);
        System.out.println(bicycle);
        System.out.println("hashCode: " + bicycle.hashCode());
        Bicycle anotherBicycle = new Bicycle("Mountain", 21, true);
        System.out.println("equals: " + bicycle.equals(anotherBicycle));

        BicycleHelmet bicycleHelmet = new BicycleHelmet("Safety", 200, true);
        System.out.println(bicycleHelmet);
        System.out.println("hashCode: " + bicycleHelmet.hashCode());
        BicycleHelmet anotherBicycleHelmet = new BicycleHelmet("Safety", 200, true);
        System.out.println("equals: " + bicycleHelmet.equals(anotherBicycleHelmet));

        BioSynth bioSynth = new BioSynth("Portable", 1500, true);
        System.out.println(bioSynth);
        System.out.println("hashCode: " + bioSynth.hashCode());
        BioSynth anotherBioSynth = new BioSynth("Portable", 1500, true);
        System.out.println("equals: " + bioSynth.equals(anotherBioSynth));

        Blender blender = new Blender("Plastic", 500, false);
        System.out.println(blender);
        System.out.println("hashCode: " + blender.hashCode());
        Blender anotherBlender = new Blender("Plastic", 500, false);
        System.out.println("equals: " + blender.equals(anotherBlender));

        Bottle bottle = new Bottle("Plastic", 750, true);
        System.out.println(bottle);
        System.out.println("hashCode: " + bottle.hashCode());
        Bottle anotherBottle = new Bottle("Plastic", 750, true);
        System.out.println("equals: " + bottle.equals(anotherBottle));

        Camera camera = new Camera("DSLR", 24, true);
        System.out.println(camera);
        System.out.println("hashCode: " + camera.hashCode());
        Camera anotherCamera = new Camera("DSLR", 24, true);
        System.out.println("equals: " + camera.equals(anotherCamera));

        CameraLens cameraLens = new CameraLens("Zoom", 18, false);
        System.out.println(cameraLens);
        System.out.println("hashCode: " + cameraLens.hashCode());
        CameraLens anotherCameraLens = new CameraLens("Zoom", 18, false);
        System.out.println("equals: " + cameraLens.equals(anotherCameraLens));

        Chair chair = new Chair("Wooden", 5, false);
        System.out.println(chair);
        System.out.println("hashCode: " + chair.hashCode());
        Chair anotherChair = new Chair("Wooden", 5, false);
        System.out.println("equals: " + chair.equals(anotherChair));

        Charger charger = new Charger("Fast", 20, true);
        System.out.println(charger);
        System.out.println("hashCode: " + charger.hashCode());
        Charger anotherCharger = new Charger("Fast", 20, true);
        System.out.println("equals: " + charger.equals(anotherCharger));

        Clock clock = new Clock("Analog", 6, true);
        System.out.println(clock);
        System.out.println("hashCode: " + clock.hashCode());
        Clock anotherClock = new Clock("Analog", 6, true);
        System.out.println("equals: " + clock.equals(anotherClock));

        CoffeeMaker coffeeMaker = new CoffeeMaker("Espresso", 2000, true);
        System.out.println(coffeeMaker);
        System.out.println("hashCode: " + coffeeMaker.hashCode());
        CoffeeMaker anotherCoffeeMaker = new CoffeeMaker("Espresso", 2000, true);
        System.out.println("equals: " + coffeeMaker.equals(anotherCoffeeMaker));

        Comb comb = new Comb("Plastic", 10, true);
        System.out.println(comb);
        System.out.println("hashCode: " + comb.hashCode());
        Comb anotherComb = new Comb("Plastic", 10, true);
        System.out.println("equals: " + comb.equals(anotherComb));

        CrystalTune crystalTune = new CrystalTune("Sound", 120, true);
        System.out.println(crystalTune);
        System.out.println("hashCode: " + crystalTune.hashCode());
        CrystalTune anotherCrystalTune = new CrystalTune("Sound", 120, true);
        System.out.println("equals: " + crystalTune.equals(anotherCrystalTune));

        Curtain curtain = new Curtain("Cotton", 10, false);
        System.out.println(curtain);
        System.out.println("hashCode: " + curtain.hashCode());
        Curtain anotherCurtain = new Curtain("Cotton", 10, false);
        System.out.println("equals: " + curtain.equals(anotherCurtain));

        Cushion cushion = new Cushion("Memory Foam", 50, true);
        System.out.println(cushion);
        System.out.println("hashCode: " + cushion.hashCode());
        Cushion anotherCushion = new Cushion("Memory Foam", 50, true);
        System.out.println("equals: " + cushion.equals(anotherCushion));

        CyberNest cyberNest = new CyberNest("Compact", 2500, true);
        System.out.println(cyberNest);
        System.out.println("hashCode: " + cyberNest.hashCode());
        CyberNest anotherCyberNest = new CyberNest("Compact", 2500, true);
        System.out.println("equals: " + cyberNest.equals(anotherCyberNest));
        Door door = new Door("Wooden", 40, true);
        System.out.println(door);
        System.out.println("hashCode: " + door.hashCode());
        Door anotherDoor = new Door("Wooden", 40, true);
        System.out.println("equals: " + door.equals(anotherDoor));

        DrawingTablet drawingTablet = new DrawingTablet("Wacom", 10, true);
        System.out.println(drawingTablet);
        System.out.println("hashCode: " + drawingTablet.hashCode());
        DrawingTablet anotherDrawingTablet = new DrawingTablet("Wacom", 10, true);
        System.out.println("equals: " + drawingTablet.equals(anotherDrawingTablet));

        Drone drone = new Drone("Quadcopter", 1500, true);
        System.out.println(drone);
        System.out.println("hashCode: " + drone.hashCode());
        Drone anotherDrone = new Drone("Quadcopter", 1500, true);
        System.out.println("equals: " + drone.equals(anotherDrone));

        Earbuds earbuds = new Earbuds("Wireless", 50, true);
        System.out.println(earbuds);
        System.out.println("hashCode: " + earbuds.hashCode());
        Earbuds anotherEarbuds = new Earbuds("Wireless", 50, true);
        System.out.println("equals: " + earbuds.equals(anotherEarbuds));

        EchoTrek echoTrek = new EchoTrek("Smart", 200, true);
        System.out.println(echoTrek);
        System.out.println("hashCode: " + echoTrek.hashCode());
        EchoTrek anotherEchoTrek = new EchoTrek("Smart", 200, true);
        System.out.println("equals: " + echoTrek.equals(anotherEchoTrek));

        ElectricKettle electricKettle = new ElectricKettle("Stainless Steel", 1500, true);
        System.out.println(electricKettle);
        System.out.println("hashCode: " + electricKettle.hashCode());
        ElectricKettle anotherElectricKettle = new ElectricKettle("Stainless Steel", 1500, true);
        System.out.println("equals: " + electricKettle.equals(anotherElectricKettle));

        Fan fan = new Fan("Ceiling", 100, true);
        System.out.println(fan);
        System.out.println("hashCode: " + fan.hashCode());
        Fan anotherFan = new Fan("Ceiling", 100, true);
        System.out.println("equals: " + fan.equals(anotherFan));

        FanHeater fanHeater = new FanHeater("Tower", 1200, true);
        System.out.println(fanHeater);
        System.out.println("hashCode: " + fanHeater.hashCode());
        FanHeater anotherFanHeater = new FanHeater("Tower", 1200, true);
        System.out.println("equals: " + fanHeater.equals(anotherFanHeater));

        FlashDrive flashDrive = new FlashDrive("USB-C", 128, true);
        System.out.println(flashDrive);
        System.out.println("hashCode: " + flashDrive.hashCode());
        FlashDrive anotherFlashDrive = new FlashDrive("USB-C", 128, true);
        System.out.println("equals: " + flashDrive.equals(anotherFlashDrive));

        Fridge fridge = new Fridge("Samsung", 300, true);
        System.out.println(fridge);
        System.out.println("hashCode: " + fridge.hashCode());
        Fridge anotherFridge = new Fridge("Samsung", 300, true);
        System.out.println("equals: " + fridge.equals(anotherFridge));

        FrostLink frostLink = new FrostLink("Compact", 500, true);
        System.out.println(frostLink);
        System.out.println("hashCode: " + frostLink.hashCode());
        FrostLink anotherFrostLink = new FrostLink("Compact", 500, true);
        System.out.println("equals: " + frostLink.equals(anotherFrostLink));

        Gamepad gamepad = new Gamepad("Wireless", 150, true);
        System.out.println(gamepad);
        System.out.println("hashCode: " + gamepad.hashCode());
        Gamepad anotherGamepad = new Gamepad("Wireless", 150, true);
        System.out.println("equals: " + gamepad.equals(anotherGamepad));

        Glasses glasses = new Glasses("Eyeglasses", 300, false);
        System.out.println(glasses);
        System.out.println("hashCode: " + glasses.hashCode());
        Glasses anotherGlasses = new Glasses("Eyeglasses", 300, false);
        System.out.println("equals: " + glasses.equals(anotherGlasses));

        GliderSync gliderSync = new GliderSync("Portable", 700, true);
        System.out.println(gliderSync);
        System.out.println("hashCode: " + gliderSync.hashCode());
        GliderSync anotherGliderSync = new GliderSync("Portable", 700, true);
        System.out.println("equals: " + gliderSync.equals(anotherGliderSync));

        GraphicsCard graphicsCard = new GraphicsCard("NVIDIA", 8, true);
        System.out.println(graphicsCard);
        System.out.println("hashCode: " + graphicsCard.hashCode());
        GraphicsCard anotherGraphicsCard = new GraphicsCard("NVIDIA", 8, true);
        System.out.println("equals: " + graphicsCard.equals(anotherGraphicsCard));

        HairDryer hairDryer = new HairDryer("Conair", 1500, true);
        System.out.println(hairDryer);
        System.out.println("hashCode: " + hairDryer.hashCode());
        HairDryer anotherHairDryer = new HairDryer("Conair", 1500, true);
        System.out.println("equals: " + hairDryer.equals(anotherHairDryer));

        Headphones headphones = new Headphones("Noise Cancelling", 100, true);
        System.out.println(headphones);
        System.out.println("hashCode: " + headphones.hashCode());
        Headphones anotherHeadphones = new Headphones("Noise Cancelling", 100, true);
        System.out.println("equals: " + headphones.equals(anotherHeadphones));

        Helmet helmet = new Helmet("Motorcycle", 1000, true);
        System.out.println(helmet);
        System.out.println("hashCode: " + helmet.hashCode());
        Helmet anotherHelmet = new Helmet("Motorcycle", 1000, true);
        System.out.println("equals: " + helmet.equals(anotherHelmet));

        Humidifier humidifier = new Humidifier("Cool Mist", 60, true);
        System.out.println(humidifier);
        System.out.println("hashCode: " + humidifier.hashCode());
        Humidifier anotherHumidifier = new Humidifier("Cool Mist", 60, true);
        System.out.println("equals: " + humidifier.equals(anotherHumidifier));

        InfernoDeck infernoDeck = new InfernoDeck("High Power", 1500, true);
        System.out.println(infernoDeck);
        System.out.println("hashCode: " + infernoDeck.hashCode());
        InfernoDeck anotherInfernoDeck = new InfernoDeck("High Power", 1500, true);
        System.out.println("equals: " + infernoDeck.equals(anotherInfernoDeck));

        Iron iron = new Iron("Steam", 1200, true);
        System.out.println(iron);
        System.out.println("hashCode: " + iron.hashCode());
        Iron anotherIron = new Iron("Steam", 1200, true);
        System.out.println("equals: " + iron.equals(anotherIron));

        Joystick joystick = new Joystick("Wireless", 200, true);
        System.out.println(joystick);
        System.out.println("hashCode: " + joystick.hashCode());
        Joystick anotherJoystick = new Joystick("Wireless", 200, true);
        System.out.println("equals: " + joystick.equals(anotherJoystick));

        Keyboard keyboard = new Keyboard("Mechanical", 800, true);
        System.out.println(keyboard);
        System.out.println("hashCode: " + keyboard.hashCode());
        Keyboard anotherKeyboard = new Keyboard("Mechanical", 800, true);
        System.out.println("equals: " + keyboard.equals(anotherKeyboard));

        Keychain keychain = new Keychain("Leather", 50, false);
        System.out.println(keychain);
        System.out.println("hashCode: " + keychain.hashCode());
        Keychain anotherKeychain = new Keychain("Leather", 50, false);
        System.out.println("equals: " + keychain.equals(anotherKeychain));

        LavaTrack lavaTrack = new LavaTrack("Wireless", 250, true);
        System.out.println(lavaTrack);
        System.out.println("hashCode: " + lavaTrack.hashCode());
        LavaTrack anotherLavaTrack = new LavaTrack("Wireless", 250, true);
        System.out.println("equals: " + lavaTrack.equals(anotherLavaTrack));
        LEDBulb ledBulb = new LEDBulb("Energy Efficient", 800, true);
        System.out.println(ledBulb);
        System.out.println("hashCode: " + ledBulb.hashCode());
        LEDBulb anotherLEDBulb = new LEDBulb("Energy Efficient", 800, true);
        System.out.println("equals: " + ledBulb.equals(anotherLEDBulb));

        LumenBox lumenBox = new LumenBox("Smart", 1000, true);
        System.out.println(lumenBox);
        System.out.println("hashCode: " + lumenBox.hashCode());
        LumenBox anotherLumenBox = new LumenBox("Smart", 1000, true);
        System.out.println("equals: " + lumenBox.equals(anotherLumenBox));

        LunchBox lunchBox = new LunchBox("Plastic", 500, true);
        System.out.println(lunchBox);
        System.out.println("hashCode: " + lunchBox.hashCode());
        LunchBox anotherLunchBox = new LunchBox("Plastic", 500, true);
        System.out.println("equals: " + lunchBox.equals(anotherLunchBox));

        Marker marker = new Marker("Permanent", 10, false);
        System.out.println(marker);
        System.out.println("hashCode: " + marker.hashCode());
        Marker anotherMarker = new Marker("Permanent", 10, false);
        System.out.println("equals: " + marker.equals(anotherMarker));

        Mattress mattress = new Mattress("Memory Foam", 1200, true);
        System.out.println(mattress);
        System.out.println("hashCode: " + mattress.hashCode());
        Mattress anotherMattress = new Mattress("Memory Foam", 1200, true);
        System.out.println("equals: " + mattress.equals(anotherMattress));

        Microphone microphone = new Microphone("USB", 200, true);
        System.out.println(microphone);
        System.out.println("hashCode: " + microphone.hashCode());
        Microphone anotherMicrophone = new Microphone("USB", 200, true);
        System.out.println("equals: " + microphone.equals(anotherMicrophone));

        Microscope microscope = new Microscope("Optical", 500, true);
        System.out.println(microscope);
        System.out.println("hashCode: " + microscope.hashCode());
        Microscope anotherMicroscope = new Microscope("Optical", 500, true);
        System.out.println("equals: " + microscope.equals(anotherMicroscope));

        Microwave microwave = new Microwave("Samsung", 700, true);
        System.out.println(microwave);
        System.out.println("hashCode: " + microwave.hashCode());
        Microwave anotherMicrowave = new Microwave("Samsung", 700, true);
        System.out.println("equals: " + microwave.equals(anotherMicrowave));

        MicrowaveOven microwaveOven = new MicrowaveOven("LG", 1000, true);
        System.out.println(microwaveOven);
        System.out.println("hashCode: " + microwaveOven.hashCode());
        MicrowaveOven anotherMicrowaveOven = new MicrowaveOven("LG", 1000, true);
        System.out.println("equals: " + microwaveOven.equals(anotherMicrowaveOven));

        Mirror mirror = new Mirror("Wall", 60, true);
        System.out.println(mirror);
        System.out.println("hashCode: " + mirror.hashCode());
        Mirror anotherMirror = new Mirror("Wall", 60, true);
        System.out.println("equals: " + mirror.equals(anotherMirror));

        MirrorStand mirrorStand = new MirrorStand("Adjustable", 150, true);
        System.out.println(mirrorStand);
        System.out.println("hashCode: " + mirrorStand.hashCode());
        MirrorStand anotherMirrorStand = new MirrorStand("Adjustable", 150, true);
        System.out.println("equals: " + mirrorStand.equals(anotherMirrorStand));

        Mobile mobile = new Mobile("Samsung", 6, true);
        System.out.println(mobile);
        System.out.println("hashCode: " + mobile.hashCode());
        Mobile anotherMobile = new Mobile("Samsung", 6, true);
        System.out.println("equals: " + mobile.equals(anotherMobile));

        Mouse mouse = new Mouse("Wireless", 150, true);
        System.out.println(mouse);
        System.out.println("hashCode: " + mouse.hashCode());
        Mouse anotherMouse = new Mouse("Wireless", 150, true);
        System.out.println("equals: " + mouse.equals(anotherMouse));

        MousePad mousePad = new MousePad("Gel", 50, false);
        System.out.println(mousePad);
        System.out.println("hashCode: " + mousePad.hashCode());
        MousePad anotherMousePad = new MousePad("Gel", 50, false);
        System.out.println("equals: " + mousePad.equals(anotherMousePad));

        NailCutter nailCutter = new NailCutter("Stainless Steel", 30, false);
        System.out.println(nailCutter);
        System.out.println("hashCode: " + nailCutter.hashCode());
        NailCutter anotherNailCutter = new NailCutter("Stainless Steel", 30, false);
        System.out.println("equals: " + nailCutter.equals(anotherNailCutter));

        NanoForge nanoForge = new NanoForge("Advanced", 1500, true);
        System.out.println(nanoForge);
        System.out.println("hashCode: " + nanoForge.hashCode());
        NanoForge anotherNanoForge = new NanoForge("Advanced", 1500, true);
        System.out.println("equals: " + nanoForge.equals(anotherNanoForge));

        NeonBlaster neonBlaster = new NeonBlaster("Flashlight", 300, true);
        System.out.println(neonBlaster);
        System.out.println("hashCode: " + neonBlaster.hashCode());
        NeonBlaster anotherNeonBlaster = new NeonBlaster("Flashlight", 300, true);
        System.out.println("equals: " + neonBlaster.equals(anotherNeonBlaster));

        Notebook notebook = new Notebook("Leather", 200, true);
        System.out.println(notebook);
        System.out.println("hashCode: " + notebook.hashCode());
        Notebook anotherNotebook = new Notebook("Leather", 200, true);
        System.out.println("equals: " + notebook.equals(anotherNotebook));

        OmegaLens omegaLens = new OmegaLens("50mm", 3000, true);
        System.out.println(omegaLens);
        System.out.println("hashCode: " + omegaLens.hashCode());
        OmegaLens anotherOmegaLens = new OmegaLens("50mm", 3000, true);
        System.out.println("equals: " + omegaLens.equals(anotherOmegaLens));

        PencilBox pencilBox = new PencilBox("Plastic", 50, false);
        System.out.println(pencilBox);
        System.out.println("hashCode: " + pencilBox.hashCode());
        PencilBox anotherPencilBox = new PencilBox("Plastic", 50, false);
        System.out.println("equals: " + pencilBox.equals(anotherPencilBox));

        Pillow pillow = new Pillow("Memory Foam", 500, true);
        System.out.println(pillow);
        System.out.println("hashCode: " + pillow.hashCode());
        Pillow anotherPillow = new Pillow("Memory Foam", 500, true);
        System.out.println("equals: " + pillow.equals(anotherPillow));

        PixelDrone pixelDrone = new PixelDrone("Quadcopter", 2500, true);
        System.out.println(pixelDrone);
        System.out.println("hashCode: " + pixelDrone.hashCode());
        PixelDrone anotherPixelDrone = new PixelDrone("Quadcopter", 2500, true);
        System.out.println("equals: " + pixelDrone.equals(anotherPixelDrone));

        Plate plate = new Plate("Ceramic", 300, true);
        System.out.println(plate);
        System.out.println("hashCode: " + plate.hashCode());
        Plate anotherPlate = new Plate("Ceramic", 300, true);
        System.out.println("equals: " + plate.equals(anotherPlate));

        PowerBank powerBank = new PowerBank("Lithium", 5000, true);
        System.out.println(powerBank);
        System.out.println("hashCode: " + powerBank.hashCode());
        PowerBank anotherPowerBank = new PowerBank("Lithium", 5000, true);
        System.out.println("equals: " + powerBank.equals(anotherPowerBank));

        Printer printer = new Printer("Laser", 1500, true);
        System.out.println(printer);
        System.out.println("hashCode: " + printer.hashCode());
        Printer anotherPrinter = new Printer("Laser", 1500, true);
        System.out.println("equals: " + printer.equals(anotherPrinter));

        Projector projector = new Projector("LED", 2000, true);
        System.out.println(projector);
        System.out.println("hashCode: " + projector.hashCode());
        Projector anotherProjector = new Projector("LED", 2000, true);
        System.out.println("equals: " + projector.equals(anotherProjector));

        QuantumMat quantumMat = new QuantumMat("Heated", 300, true);
        System.out.println(quantumMat);
        System.out.println("hashCode: " + quantumMat.hashCode());
        QuantumMat anotherQuantumMat = new QuantumMat("Heated", 300, true);
        System.out.println("equals: " + quantumMat.equals(anotherQuantumMat));

        Refrigerator refrigerator = new Refrigerator("LG", 500, true);
        System.out.println(refrigerator);
        System.out.println("hashCode: " + refrigerator.hashCode());
        Refrigerator anotherRefrigerator = new Refrigerator("LG", 500, true);
        System.out.println("equals: " + refrigerator.equals(anotherRefrigerator));

        Remote remote = new Remote("Universal", 100, true);
        System.out.println(remote);
        System.out.println("hashCode: " + remote.hashCode());
        Remote anotherRemote = new Remote("Universal", 100, true);
        System.out.println("equals: " + remote.equals(anotherRemote));

        RingLight ringLight = new RingLight("LED", 500, true);
        System.out.println(ringLight);
        System.out.println("hashCode: " + ringLight.hashCode());
        RingLight anotherRingLight = new RingLight("LED", 500, true);
        System.out.println("equals: " + ringLight.equals(anotherRingLight));

        Router router = new Router("Wi-Fi", 2000, true);
        System.out.println(router);
        System.out.println("hashCode: " + router.hashCode());
        Router anotherRouter = new Router("Wi-Fi", 2000, true);
        System.out.println("equals: " + router.equals(anotherRouter));

        Scanner scanner = new Scanner("Flatbed", 1500, true);
        System.out.println(scanner);
        System.out.println("hashCode: " + scanner.hashCode());
        Scanner anotherScanner = new Scanner("Flatbed", 1500, true);
        System.out.println("equals: " + scanner.equals(anotherScanner));

        Screwdriver screwdriver = new Screwdriver("Manual", 50, true);
        System.out.println(screwdriver);
        System.out.println("hashCode: " + screwdriver.hashCode());
        Screwdriver anotherScrewdriver = new Screwdriver("Manual", 50, true);
        System.out.println("equals: " + screwdriver.equals(anotherScrewdriver));

        SelfieStick selfieStick = new SelfieStick("Bluetooth", 500, true);
        System.out.println(selfieStick);
        System.out.println("hashCode: " + selfieStick.hashCode());
        SelfieStick anotherSelfieStick = new SelfieStick("Bluetooth", 500, true);
        System.out.println("equals: " + selfieStick.equals(anotherSelfieStick));

        Shoes shoes = new Shoes("Sports", 1500, true);
        System.out.println(shoes);
        System.out.println("hashCode: " + shoes.hashCode());
        Shoes anotherShoes = new Shoes("Sports", 1500, true);
        System.out.println("equals: " + shoes.equals(anotherShoes));

        Skateboard skateboard = new Skateboard("Electric", 3000, true);
        System.out.println(skateboard);
        System.out.println("hashCode: " + skateboard.hashCode());
        Skateboard anotherSkateboard = new Skateboard("Electric", 3000, true);
        System.out.println("equals: " + skateboard.equals(anotherSkateboard));

        Smartwatch smartwatch = new Smartwatch("Apple", 5000, true);
        System.out.println(smartwatch);
        System.out.println("hashCode: " + smartwatch.hashCode());
        Smartwatch anotherSmartwatch = new Smartwatch("Apple", 5000, true);
        System.out.println("equals: " + smartwatch.equals(anotherSmartwatch));

        Sofa sofa = new Sofa("Leather", 7000, true);
        System.out.println(sofa);
        System.out.println("hashCode: " + sofa.hashCode());
        Sofa anotherSofa = new Sofa("Leather", 7000, true);
        System.out.println("equals: " + sofa.equals(anotherSofa));

        SolarNest solarNest = new SolarNest("Portable", 1200, true);
        System.out.println(solarNest);
        System.out.println("hashCode: " + solarNest.hashCode());
        SolarNest anotherSolarNest = new SolarNest("Portable", 1200, true);
        System.out.println("equals: " + solarNest.equals(anotherSolarNest));

        Speaker speaker = new Speaker("Bluetooth", 500, true);
        System.out.println(speaker);
        System.out.println("hashCode: " + speaker.hashCode());
        Speaker anotherSpeaker = new Speaker("Bluetooth", 500, true);
        System.out.println("equals: " + speaker.equals(anotherSpeaker));

        Stapler stapler = new Stapler("Heavy Duty", 50, true);
        System.out.println(stapler);
        System.out.println("hashCode: " + stapler.hashCode());
        Stapler anotherStapler = new Stapler("Heavy Duty", 50, true);
        System.out.println("equals: " + stapler.equals(anotherStapler));

        Sunglasses sunglasses = new Sunglasses("Ray-Ban", 3000, false);
        System.out.println(sunglasses);
        System.out.println("hashCode: " + sunglasses.hashCode());
        Sunglasses anotherSunglasses = new Sunglasses("Ray-Ban", 3000, false);
        System.out.println("equals: " + sunglasses.equals(anotherSunglasses));

        Table table = new Table("Wooden", 5000, true);
        System.out.println(table);
        System.out.println("hashCode: " + table.hashCode());
        Table anotherTable = new Table("Wooden", 5000, true);
        System.out.println("equals: " + table.equals(anotherTable));

        Television television = new Television("LED", 8000, true);
        System.out.println(television);
        System.out.println("hashCode: " + television.hashCode());
        Television anotherTelevision = new Television("LED", 8000, true);
        System.out.println("equals: " + television.equals(anotherTelevision));

        Thermometer thermometer = new Thermometer("Digital", 100, true);
        System.out.println(thermometer);
        System.out.println("hashCode: " + thermometer.hashCode());
        Thermometer anotherThermometer = new Thermometer("Digital", 100, true);
        System.out.println("equals: " + thermometer.equals(anotherThermometer));

        Toothbrush toothbrush = new Toothbrush("Electric", 200, false);
        System.out.println(toothbrush);
        System.out.println("hashCode: " + toothbrush.hashCode());
        Toothbrush anotherToothbrush = new Toothbrush("Electric", 200, false);
        System.out.println("equals: " + toothbrush.equals(anotherToothbrush));

        Towel towel = new Towel("Cotton", 100, false);
        System.out.println(towel);
        System.out.println("hashCode: " + towel.hashCode());
        Towel anotherTowel = new Towel("Cotton", 100, false);
        System.out.println("equals: " + towel.equals(anotherTowel));

        Tripod tripod = new Tripod("Adjustable", 1500, true);
        System.out.println(tripod);
        System.out.println("hashCode: " + tripod.hashCode());
        Tripod anotherTripod = new Tripod("Adjustable", 1500, true);
        System.out.println("equals: " + tripod.equals(anotherTripod));

        VortexShield vortexShield = new VortexShield("High Efficiency", 2500, true);
        System.out.println(vortexShield);
        System.out.println("hashCode: " + vortexShield.hashCode());
        VortexShield anotherVortexShield = new VortexShield("High Efficiency", 2500, true);
        System.out.println("equals: " + vortexShield.equals(anotherVortexShield));

        Wallet wallet = new Wallet("Leather", 500, true);
        System.out.println(wallet);
        System.out.println("hashCode: " + wallet.hashCode());
        Wallet anotherWallet = new Wallet("Leather", 500, true);
        System.out.println("equals: " + wallet.equals(anotherWallet));

        WashingMachine washingMachine = new WashingMachine("Samsung", 5000, true);
        System.out.println(washingMachine);
        System.out.println("hashCode: " + washingMachine.hashCode());
        WashingMachine anotherWashingMachine = new WashingMachine("Samsung", 5000, true);
        System.out.println("equals: " + washingMachine.equals(anotherWashingMachine));

        WaterBottle waterBottle = new WaterBottle("Plastic", 500, false);
        System.out.println(waterBottle);
        System.out.println("hashCode: " + waterBottle.hashCode());
        WaterBottle anotherWaterBottle = new WaterBottle("Plastic", 500, false);
        System.out.println("equals: " + waterBottle.equals(anotherWaterBottle));

        ZenPulse zenPulse = new ZenPulse("Smart", 1500, true);
        System.out.println(zenPulse);
        System.out.println("hashCode: " + zenPulse.hashCode());
        ZenPulse anotherZenPulse = new ZenPulse("Smart", 1500, true);
        System.out.println("equals: " + zenPulse.equals(anotherZenPulse));
    }
}


