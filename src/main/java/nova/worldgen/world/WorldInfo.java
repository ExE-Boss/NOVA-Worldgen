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

package nova.worldgen.world;

import nova.core.util.registry.Registry;
import nova.core.util.shape.Cuboid;
import nova.worldgen.ore.Ore;

/**
 * This class provides information on world that world generator may need
 */
public abstract class WorldInfo {
	/**
	 * @return Size of the world, can be infinite for some directions
	 */
	public abstract Cuboid getWorldDimmensions();

	/**
	 * @return Size of chunk that is generated by world generator
	 */
	public abstract Cuboid getWorldGenerationUnitDimmensions();

	/**
	 * @return {@link Registry}{@code <}{@link Ore}{@code >} for the world
	 */
	public abstract Registry<Ore> getOreGenerationRegistry();
}
