package Nokia;

import java.util.Scanner;

public class NokiaExit {
        public static void main(String[] args) {
            Scanner phone = new Scanner(System.in);
            System.out.println("""
                Nokia 3310 List of menu functions.
                1 -- Phone book
                2 -- Messages
                3 -- Chat
                4 -- Call register
                5 -- Tones
                6 -- Settings
                7 -- Call divert
                8 -- Games
                9 -- Calculator
                10 -- Reminders
                11 -- Clock
                12 -- Profiles
                13 -- SIM services
                14 -- Exit
                """);

            System.out.print("Above are list  of Menu functions, Please enter the corresponding number to navigate to the menu of your choice ");
            int menuFunctions = phone.nextInt();

           // while (menuFunctions < 1 || menuFunctions > 14) {
            //    System.out.print("You just entered and invalid number");
             //   System.out.println("Above are list  of Menu functions, Please enter the corresponding number to navigate to the menu of your choice ");
             //   menuFunctions = phone.nextInt();
           // }

            switch (menuFunctions) {
                case 1:
                    System.out.println("""
                        1 >> Search
                        2 >> Service Nos.
                        3 >> Add name
                        4 >> Erase
                        5 >> Edit
                        6 >> Assign tone
                        7 >> Send b'card
                        8 >> Options
                        9 >> Speed dials
                        10 >> Voice tags
                        11 >> Return to main menu
                        """);

                    System.out.print("Kindly enter the corresponding digit of the option you want to explore further, or return to main menu ");
                    int subInputPhonebook = phone.nextInt();

                    switch (subInputPhonebook) {
                        case 1:
                            System.out.println("Kindly input your search");
                            break;
                        case 2:
                            System.out.println("Here are the service Numbers");
                            break;
                        case 3:
                            System.out.println("Now Add name");
                            break;
                        case 4:
                            System.out.println("Are you sure you want to Erase ? ");
                            break;
                        case 5:
                            System.out.println("You can make your edit now");
                            break;
                        case 6:
                            System.out.println("Assign a tune of your choice");
                            break;
                        case 7:
                            System.out.println("Here are available business cards, make your choice");
                            break;
                        case 8:
                            System.out.println("""
                                1
                                2
                                3
                                """);

                            System.out.print("""
                                --> For Type of view press 1
                                --> To get Memory status press 2
                                --> Press 3 to return to previous menu
                                 """);
                            int moreOptions = phone.nextInt();

                            switch (moreOptions) {
                                case 1:
                                    System.out.println("What type of view do you want ?");
                                    break;
                                case 2:
                                    System.out.println("Here is your memory status");
                                    break;
                                case 3:

                            }
                            //break;
                        case 9:
                            System.out.println("Here are your speed dials");
                            break;

                        case 10:
                            System.out.println("Here are your voice tags");
                            break;

                        case 11:
                            System.out.print("Above are list  of Menu functions, Please enter the corresponding number to navigate to the menu of your choice ");
                            menuFunctions = phone.nextInt();

                    }
                    break;

                case 2:
                    System.out.println("""
                        1 >> Write messages
                        2 >> Inbox
                        3 >> Outbox
                        4 >> Picture messages
                        5 >> Templates
                        6 >> Smileys
                        7 >> message settings
                        8 >> Info service
                        9 >> Voice mailbox number
                        10 >> Service command editor
                        """);

                    System.out.print("Kindly enter the corresponding digit of the option you want to explore further ");
                    int subInputMessages = phone.nextInt();

                    switch (subInputMessages) {
                        case 1:
                            System.out.println("Kindly input your message");
                            break;
                        case 2:
                            System.out.println("Here is your inbox");
                            break;
                        case 3:
                            System.out.println("Here is your outbox");
                            break;
                        case 4:
                            System.out.println("select one of the pictures you want to send as message ");
                            break;
                        case 5:
                            System.out.println("Here are available templates");
                            break;
                        case 6:
                            System.out.println("pick from the smileys options");
                            break;
                        case 7:
                            System.out.println("""
                                1
                                2
                                """);

                            System.out.print("""
                                --> To set press 1
                                --> For common press 2
                                 """);
                            int moreOptionsMessageSettings = phone.nextInt();

                            switch (moreOptionsMessageSettings) {
                                case 1:
                                    System.out.println("""
                                        1
                                        2
                                        3
                                        """);

                                    System.out.print("""
                                        --> For message center number press 1
                                        --> To know what messages are sent as  press 2
                                        --> For message Validity press 3
                                         """);
                                    int subOptionsMessageSet = phone.nextInt();

                                    switch (subOptionsMessageSet) {
                                        case 1:
                                            System.out.println("Here is your message center number");
                                            break;
                                        case 2:
                                            System.out.println("Here is what messages are sent as");
                                            break;
                                        case 3:
                                            System.out.println("Here is your message validity option");
                                            break;
                                    }
                                case 2:
                                    System.out.println("""
                                        1
                                        2
                                        3
                                        """);

                                    System.out.print("""
                                        --> For delivery report press 1
                                        --> for reply via same center  press 2
                                        --> For for character support press 3
                                         """);
                                    int subOptionsMessageCommon = phone.nextInt();

                                    switch (subOptionsMessageCommon) {
                                        case 1:
                                            System.out.println("Here is your delivery report");
                                            break;
                                        case 2:
                                            System.out.println("you can now reply via same center");
                                            break;
                                        case 3:
                                            System.out.println("See your character support status");
                                            break;
                                    }
                            }
                        case 8:
                            System.out.println("available info services are");
                            break;
                        case 9:
                            System.out.println("here is your voice mailbox number");
                            break;
                        case 10:
                            System.out.println("This is the service command editor");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Here are your chats");
                    break;

                case 4:
                    System.out.println("""
                        1 >> Missed calls
                        2 >> Received
                        3 >> Dialled number
                        4 >> Erase recent call lists
                        5 >> Show call duration
                        6 >> Show call costs
                        7 >> Call cost settings
                        8 >> Prepaid credit
                        """);

                    System.out.print("Kindly enter the corresponding digit of the option you want to explore further ");
                    int subInputCallRegister = phone.nextInt();

                    switch (subInputCallRegister) {
                        case 1:
                            System.out.println("Here are your missed calls");
                            break;
                        case 2:
                            System.out.println("Received calls are");
                            break;
                        case 3:
                            System.out.println("Dialled numbers are");
                            break;
                        case 4:
                            System.out.println("Are you sure you want to Erase recent call lists ? ");
                            break;
                        case 5:

                            System.out.println("""
                                1
                                2
                                3
                                4
                                5
                                """);

                            System.out.print("""
                                --> For last call duration press 1
                                --> for all calls' duration  press 2
                                --> For received calls' duration press 3
                                --> For dialled calls' duration press 4
                                --> To clear timers press 5
                                 """);
                            int subInputCallRegisterCallDuration = phone.nextInt();

                            switch (subInputCallRegisterCallDuration) {
                                case 1:
                                    System.out.println("Your last call duration is");
                                    break;
                                case 2:
                                    System.out.println("duration of all calls recieved is");
                                    break;
                                case 3:
                                    System.out.println("duration of received calls is");
                                    break;
                                case 4:
                                    System.out.println("duration of dialled calls is");
                                    break;
                                case 5:
                                    System.out.println("are you sure you want to clear timers ?");
                                    break;
                            }

                        default:
                            System.out.println("You just entered and invalid number");

                    }

            }
        }
}
