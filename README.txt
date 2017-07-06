CS 6352 - Performance of Computer Systems and Networks
Spring 2017
Name : Arun Prakash Themothy Prabu Vincent (axt161330) 

The Project was developed in Eclipse in MacOS

You run the program with the following command (for a Unix machine):
java -jar “/Location/of/the/pcsn.jar“ Location/of/the/config.txt

The format of the config file is as follows:

{line1}: “lamda - Arrival Rate of packets”
{line2}: “mu - Service rate of nodes” 
{line3}: “a1 - probability of packet arriving at queue 1”
{line4}: “a2 - probability of packet arriving at queue 2”
{line5}: “a3 - probability of packet arriving at queue 3”
{line6}: “r1 - probability of packet departing out of system from queue1”
{line7}: “r2 - probability of packet departing out of system from queue1”
{line8}: “r3 - probability of packet departing out of system from queue1”

Terminal Command to Run : 

java -jar /Users/ArunPrakash/Desktop/PcsnProj2.jar /Users/ArunPrakash/Desktop/config.txt
