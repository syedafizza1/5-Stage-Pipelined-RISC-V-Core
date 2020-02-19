# 5-Stage-Pipelined-RISC-V-Core
A 5-STAGE PIPELINED  Core on RISC-V Implementation With Hazards

Designed by Syeda Fizza Jaffery

First of all get started by cloning this repository on your machine.
make a folder Zarrar_1 and then clone the given folders in that folder

git clone https://github.com/syedafizza1/5-Stage-Pipelined-RISC-V-Core.git

Create a .txt file and place the hexadecimal code of your instructions simulated on Venus (RISC-V Simulator) Each instruction's hexadecimal code must be on seperate line as following. This program consists of 9 instructions.


00500193
008000ef
028000ef
003181b3
ffc10113
00112023
010000ef
00012083
00410113
00008067
403181b3
00008067


Then perform the following step

cd chisel-tutorial/src/main/scala/riscv

Open insmem.scala with this command. You can also manually go into the above path and open the file in your favorite text editor.

open insmem.scala

Find the following line

Memory From File(mem,"/home/fizza/textfile.txt")

Change the .txt file path to match your file that you created above storing your own program instructions. After setting up the Memory.scala file, go inside the chisel-tutorial folder.

cd chisel-tutorial

And enter

sbt

When the terminal changes to this type

sbt:chisel-tutorial>

Enter this command

sbt:chisel-tutorial> test:runMain riscv.Launcher TopPipeline

After you get success

sbt:chisel-tutorial> test:runMain riscv.Launcher TopPipeline --backend-name verilator

After success you will get a folder test_run_dir on root of your folder. Go into the examples folder inside. There you will find the folder named top. Enter in it and you can find the top.vcd file which you visualise on gtkwave to see your program running.
