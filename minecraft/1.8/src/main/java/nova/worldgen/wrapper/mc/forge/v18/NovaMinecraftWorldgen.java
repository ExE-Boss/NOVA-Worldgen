/*
 * Copyright (c) 2015 NOVA, All rights reserved.
 * This library is free software, licensed under GNU Lesser General Public License version 3
 *
 * This file is part of NOVA.
 *
 * NOVA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NOVA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NOVA.  If not, see <http://www.gnu.org/licenses/>.
 */

package nova.worldgen.wrapper.mc.forge.v18;

import net.minecraftforge.fml.common.registry.GameRegistry;
import nova.core.loader.Loadable;
import nova.core.loader.Mod;
import nova.worldgen.WorldgenManager;
import nova.worldgen.wrapper.mc.forge.v18.wrapper.world.forward.FWWorldGenerator;

/**
 *
 * @author ExE Boss
 */
@Mod(id = NovaMinecraftWorldgen.id, name = NovaMinecraftWorldgen.name, version = NovaMinecraftWorldgen.version, novaVersion = "0.0.1")
public class NovaMinecraftWorldgen implements Loadable {

	public static final String version = "0.0.1";
	public static final String id = "novaworldgen";
	public static final String name = "NOVA Worldgen";

	public final WorldgenManager worldgenManager;

	public FWWorldGenerator worldGenerator;

	public NovaMinecraftWorldgen(WorldgenManager worldgenManager) {
		this.worldgenManager = worldgenManager;
	}

	@Override
	public void init() {
		worldGenerator = new FWWorldGenerator(worldgenManager);
		GameRegistry.registerWorldGenerator(worldGenerator, 0);
	}
}
