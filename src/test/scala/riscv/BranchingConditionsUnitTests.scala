package riscv

import chisel3.iotesters.PeekPokeTester

class BranchingConditionsUnitTests(c: BranchingConditionsUnit) extends PeekPokeTester(c) {
  poke(c.io.in_rs1, -2)
  poke(c.io.in_rs2, -2)
  poke(c.io.in_func3, 0)
  step(1)
  expect(c.io.output, 1)
}
