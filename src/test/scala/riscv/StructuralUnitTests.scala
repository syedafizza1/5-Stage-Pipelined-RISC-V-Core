package riscv

import chisel3.iotesters.PeekPokeTester

class StructuralUnitTests(c: StructuralUnit) extends PeekPokeTester(c) {
  
  poke(c.io.MEM_WB_RegWrite_out, 1)
  poke(c.io.MEM_WB_rd_out, 2)
  poke(c.io.rs1_s, 2)
  poke(c.io.rs2_s, 10)
  step(1)
  expect(c.io.out_rs1, 1)
  expect(c.io.out_rs2, 0)
}
