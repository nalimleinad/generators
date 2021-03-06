/*
 * Copyright (c) bdew, 2014
 * https://github.com/bdew/generators
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.generators.compat

import buildcraft.api.fuels.IronEngineFuel

object BCCompat {
  def getCombustionEngineFuels = {
    import scala.collection.JavaConversions._
    IronEngineFuel.fuels map { case (id, fuel) =>
      fuel.liquid -> fuel.powerPerCycle * fuel.totalBurningTime / 1000F
    }
  }
}
