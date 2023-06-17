package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.UnitUUID.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnitUUIDTest {

	@Test
	public void test_map_00001() {
		assertTrue(UNIT_MAPPING_128.containsKey(UNITLESS_UNIT));
		assertEquals("unitless", UNIT_MAPPING_128.get(UNITLESS_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LENGTH_METRE_UNIT));
		assertEquals("length (metre)", UNIT_MAPPING_128.get(LENGTH_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MASS_KILOGRAM_UNIT));
		assertEquals("mass (kilogram)", UNIT_MAPPING_128.get(MASS_KILOGRAM_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(TIME_SECOND_UNIT));
		assertEquals("time (second)", UNIT_MAPPING_128.get(TIME_SECOND_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ELECTRIC_CURRENT_AMPERE_UNIT));
		assertEquals("electric current (ampere)", UNIT_MAPPING_128.get(ELECTRIC_CURRENT_AMPERE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(THERMODYNAMIC_TEMPERATURE_KELVIN_UNIT));
		assertEquals("thermodynamic temperature (kelvin)", UNIT_MAPPING_128.get(THERMODYNAMIC_TEMPERATURE_KELVIN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(AMOUNT_OF_SUBSTANCE_MOLE_UNIT));
		assertEquals("amount of substance (mole)", UNIT_MAPPING_128.get(AMOUNT_OF_SUBSTANCE_MOLE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LUMINOUS_INTENSITY_CANDELA_UNIT));
		assertEquals("luminous intensity (candela)", UNIT_MAPPING_128.get(LUMINOUS_INTENSITY_CANDELA_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(AREA_SQUARE_METRES_UNIT));
		assertEquals("area (square metres)", UNIT_MAPPING_128.get(AREA_SQUARE_METRES_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(VOLUME_CUBIC_METRES_UNIT));
		assertEquals("volume (cubic metres)", UNIT_MAPPING_128.get(VOLUME_CUBIC_METRES_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(VELOCITY_METRES_PER_SECOND_UNIT));
		assertEquals("velocity (metres per second)", UNIT_MAPPING_128.get(VELOCITY_METRES_PER_SECOND_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ACCELERATION_METRES_PER_SECOND_SQUARED_UNIT));
		assertEquals("acceleration (metres per second squared)",
				UNIT_MAPPING_128.get(ACCELERATION_METRES_PER_SECOND_SQUARED_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(WAVENUMBER_RECIPROCAL_METRE_UNIT));
		assertEquals("wavenumber (reciprocal metre)", UNIT_MAPPING_128.get(WAVENUMBER_RECIPROCAL_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(DENSITY_KILOGRAM_PER_CUBIC_METRE_UNIT));
		assertEquals("density (kilogram per cubic metre)", UNIT_MAPPING_128.get(DENSITY_KILOGRAM_PER_CUBIC_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(SURFACE_DENSITY_KILOGRAM_PER_SQUARE_METRE_UNIT));
		assertEquals("surface density (kilogram per square metre)",
				UNIT_MAPPING_128.get(SURFACE_DENSITY_KILOGRAM_PER_SQUARE_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(SPECIFIC_VOLUME_CUBIC_METRE_PER_KILOGRAM_UNIT));
		assertEquals("specific volume (cubic metre per kilogram)",
				UNIT_MAPPING_128.get(SPECIFIC_VOLUME_CUBIC_METRE_PER_KILOGRAM_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(CURRENT_DENSITY_AMPERE_PER_SQUARE_METRE_UNIT));
		assertEquals("current density (ampere per square metre)",
				UNIT_MAPPING_128.get(CURRENT_DENSITY_AMPERE_PER_SQUARE_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MAGNETIC_FIELD_STRENGTH_AMPERE_PER_METRE_UNIT));
		assertEquals("magnetic field strength (ampere per metre)",
				UNIT_MAPPING_128.get(MAGNETIC_FIELD_STRENGTH_AMPERE_PER_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(AMOUNT_CONCENTRATION_MOLE_PER_CUBIC_METRE_UNIT));
		assertEquals("amount concentration (mole per cubic metre)",
				UNIT_MAPPING_128.get(AMOUNT_CONCENTRATION_MOLE_PER_CUBIC_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MASS_CONCENTRATION_KILOGRAM_PER_CUBIC_METRE_UNIT));
		assertEquals("mass concentration (kilogram per cubic metre)",
				UNIT_MAPPING_128.get(MASS_CONCENTRATION_KILOGRAM_PER_CUBIC_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LUMINANCE_CANDELA_PER_SQUARE_METRE_UNIT));
		assertEquals("luminance (candela per square metre)",
				UNIT_MAPPING_128.get(LUMINANCE_CANDELA_PER_SQUARE_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(REFRACTIVE_INDEX_UNIT));
		assertEquals("refractive index", UNIT_MAPPING_128.get(REFRACTIVE_INDEX_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(RELATIVE_PERMEABILITY_UNIT));
		assertEquals("relative permeability", UNIT_MAPPING_128.get(RELATIVE_PERMEABILITY_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PLANE_ANGLE_RADIAN_UNIT));
		assertEquals("plane angle (radian)", UNIT_MAPPING_128.get(PLANE_ANGLE_RADIAN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(SOLID_ANGLE_STERADIAN_UNIT));
		assertEquals("solid angle (steradian)", UNIT_MAPPING_128.get(SOLID_ANGLE_STERADIAN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(FREQUENCY_HERTZ_UNIT));
		assertEquals("frequency (hertz)", UNIT_MAPPING_128.get(FREQUENCY_HERTZ_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(FORCE_NEWTON_UNIT));
		assertEquals("force (newton)", UNIT_MAPPING_128.get(FORCE_NEWTON_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PRESSURE_PASCAL_UNIT));
		assertEquals("pressure (pascal)", UNIT_MAPPING_128.get(PRESSURE_PASCAL_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ENERGY_JOULE_UNIT));
		assertEquals("energy (joule)", UNIT_MAPPING_128.get(ENERGY_JOULE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(POWER_WATT_UNIT));
		assertEquals("power (watt)", UNIT_MAPPING_128.get(POWER_WATT_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ELECTRIC_CHARGE_COULOMB_UNIT));
		assertEquals("electric charge (coulomb)", UNIT_MAPPING_128.get(ELECTRIC_CHARGE_COULOMB_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ELECTRIC_POTENTIAL_DIFFERENCE_VOLT_UNIT));
		assertEquals("electric potential difference (volt)",
				UNIT_MAPPING_128.get(ELECTRIC_POTENTIAL_DIFFERENCE_VOLT_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(CAPACITANCE_FARAD_UNIT));
		assertEquals("capacitance (farad)", UNIT_MAPPING_128.get(CAPACITANCE_FARAD_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ELECTRIC_RESISTANCE_OHM_UNIT));
		assertEquals("electric resistance (ohm)", UNIT_MAPPING_128.get(ELECTRIC_RESISTANCE_OHM_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ELECTRIC_CONDUCTANCE_SIEMENS_UNIT));
		assertEquals("electric conductance (siemens)", UNIT_MAPPING_128.get(ELECTRIC_CONDUCTANCE_SIEMENS_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MAGNETIC_FLUX_WEBER_UNIT));
		assertEquals("magnetic flux (weber)", UNIT_MAPPING_128.get(MAGNETIC_FLUX_WEBER_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MAGNETIC_FLUX_DENSITY_TESLA_UNIT));
		assertEquals("magnetic flux density (tesla)", UNIT_MAPPING_128.get(MAGNETIC_FLUX_DENSITY_TESLA_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(INDUCTANCE_HENRY_UNIT));
		assertEquals("inductance (henry)", UNIT_MAPPING_128.get(INDUCTANCE_HENRY_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(THERMODYNAMIC_TEMPERATURE_DEGREE_CELSIUS_UNIT));
		assertEquals("Celsius temperature (degree Celsius)",
				UNIT_MAPPING_128.get(THERMODYNAMIC_TEMPERATURE_DEGREE_CELSIUS_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LUMINOUS_FLUX_LUMEN_UNIT));
		assertEquals("luminous flux (lumen)", UNIT_MAPPING_128.get(LUMINOUS_FLUX_LUMEN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ILLUMINANCE_LUX_UNIT));
		assertEquals("illuminance (lux)", UNIT_MAPPING_128.get(ILLUMINANCE_LUX_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ACTIVITY_REFERRED_TO_A_RADIONUCLIDE_BECQUEREL_UNIT));
		assertEquals("activity referred to a radionuclide (becquerel)",
				UNIT_MAPPING_128.get(ACTIVITY_REFERRED_TO_A_RADIONUCLIDE_BECQUEREL_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ABSORBED_DOSE_GRAY_UNIT));
		assertEquals("absorbed dose (gray)", UNIT_MAPPING_128.get(ABSORBED_DOSE_GRAY_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(DOSE_EQUIVALENT_SIEVERT_UNIT));
		assertEquals("dose equivalent (sievert)", UNIT_MAPPING_128.get(DOSE_EQUIVALENT_SIEVERT_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(CATALYTIC_ACTIVITY_KATAL_UNIT));
		assertEquals("catalytic activity (katal)", UNIT_MAPPING_128.get(CATALYTIC_ACTIVITY_KATAL_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(DYNAMIC_VISCOSITY_PASCAL_SECOND_UNIT));
		assertEquals("dynamic viscosity (pascal second)", UNIT_MAPPING_128.get(DYNAMIC_VISCOSITY_PASCAL_SECOND_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MOMENT_OF_FORCE_NEWTON_METRE_UNIT));
		assertEquals("moment of force (newton metre)", UNIT_MAPPING_128.get(MOMENT_OF_FORCE_NEWTON_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(SURFACE_TENSION_NEWTON_PER_METRE_UNIT));
		assertEquals("surface tension (newton per metre)", UNIT_MAPPING_128.get(SURFACE_TENSION_NEWTON_PER_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ANGULAR_VELOCITY_RADIAN_PER_SECOND_UNIT));
		assertEquals("angular velocity (radian per second)",
				UNIT_MAPPING_128.get(ANGULAR_VELOCITY_RADIAN_PER_SECOND_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ANGULAR_ACCELERATION_RADIAN_PER_SECOND_SQUARED_UNIT));
		assertEquals("angular acceleration (radian per second squared)",
				UNIT_MAPPING_128.get(ANGULAR_ACCELERATION_RADIAN_PER_SECOND_SQUARED_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(HEAT_FLUX_DENSITY_WATT_PER_SQUARE_METRE_UNIT));
		assertEquals("heat flux density (watt per square metre)",
				UNIT_MAPPING_128.get(HEAT_FLUX_DENSITY_WATT_PER_SQUARE_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(HEAT_CAPACITY_JOULE_PER_KELVIN_UNIT));
		assertEquals("heat capacity (joule per kelvin)", UNIT_MAPPING_128.get(HEAT_CAPACITY_JOULE_PER_KELVIN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(SPECIFIC_HEAT_CAPACITY_JOULE_PER_KILOGRAM_KELVIN_UNIT));
		assertEquals("specific heat capacity (joule per kilogram kelvin)",
				UNIT_MAPPING_128.get(SPECIFIC_HEAT_CAPACITY_JOULE_PER_KILOGRAM_KELVIN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(SPECIFIC_ENERGY_JOULE_PER_KILOGRAM_UNIT));
		assertEquals("specific energy (joule per kilogram)",
				UNIT_MAPPING_128.get(SPECIFIC_ENERGY_JOULE_PER_KILOGRAM_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(THERMAL_CONDUCTIVITY_WATT_PER_METRE_KELVIN_UNIT));
		assertEquals("thermal conductivity (watt per metre kelvin)",
				UNIT_MAPPING_128.get(THERMAL_CONDUCTIVITY_WATT_PER_METRE_KELVIN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ENERGY_DENSITY_JOULE_PER_CUBIC_METRE_UNIT));
		assertEquals("energy density (joule per cubic metre)",
				UNIT_MAPPING_128.get(ENERGY_DENSITY_JOULE_PER_CUBIC_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ELECTRIC_FIELD_STRENGTH_VOLT_PER_METRE_UNIT));
		assertEquals("electric field strength (volt per metre)",
				UNIT_MAPPING_128.get(ELECTRIC_FIELD_STRENGTH_VOLT_PER_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ELECTRIC_CHARGE_DENSITY_COULOMB_PER_CUBIC_METRE_UNIT));
		assertEquals("electric charge density (coulomb per cubic metre)",
				UNIT_MAPPING_128.get(ELECTRIC_CHARGE_DENSITY_COULOMB_PER_CUBIC_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(SURFACE_CHARGE_DENSITY_COULOMB_PER_SQUARE_METRE_UNIT));
		assertEquals("surface charge density (coulomb per square metre)",
				UNIT_MAPPING_128.get(SURFACE_CHARGE_DENSITY_COULOMB_PER_SQUARE_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ELECTRIC_FLUX_DENSITY_COULOMB_PER_SQUARE_METRE_UNIT));
		assertEquals("electric flux density (coulomb per square metre)",
				UNIT_MAPPING_128.get(ELECTRIC_FLUX_DENSITY_COULOMB_PER_SQUARE_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PERMITTIVITY_FARAD_PER_METRE_UNIT));
		assertEquals("permittivity (farad per metre)", UNIT_MAPPING_128.get(PERMITTIVITY_FARAD_PER_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PERMEABILITY_HENRY_PER_METRE_UNIT));
		assertEquals("permeability (henry per metre)", UNIT_MAPPING_128.get(PERMEABILITY_HENRY_PER_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MOLAR_ENERGY_JOULE_PER_MOLE_UNIT));
		assertEquals("molar energy (joule per mole)", UNIT_MAPPING_128.get(MOLAR_ENERGY_JOULE_PER_MOLE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MOLAR_ENTROPY_JOULE_PER_MOLE_KELVIN_UNIT));
		assertEquals("molar entropy (joule per mole kelvin)",
				UNIT_MAPPING_128.get(MOLAR_ENTROPY_JOULE_PER_MOLE_KELVIN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(EXPOSURE_COULOMB_PER_KILOGRAM_UNIT));
		assertEquals("exposure (coulomb per kilogram)", UNIT_MAPPING_128.get(EXPOSURE_COULOMB_PER_KILOGRAM_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ABSORBED_DOSE_RATE_GRAY_PER_SECOND_UNIT));
		assertEquals("absorbed dose rate (gray per second)",
				UNIT_MAPPING_128.get(ABSORBED_DOSE_RATE_GRAY_PER_SECOND_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(RADIANT_INTENSITY_WATT_PER_STERADIAN_UNIT));
		assertEquals("radiant intensity (watt per steradian)",
				UNIT_MAPPING_128.get(RADIANT_INTENSITY_WATT_PER_STERADIAN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(RADIANCE_WATT_PER_SQUARE_METRE_STERADIAN_UNIT));
		assertEquals("radiance (watt per square metre steradian)",
				UNIT_MAPPING_128.get(RADIANCE_WATT_PER_SQUARE_METRE_STERADIAN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(CATALYTIC_ACTIVITY_CONCENTRATION_KATAL_PER_CUBIC_METRE_UNIT));
		assertEquals("catalytic activity concentration (katal per cubic metre)",
				UNIT_MAPPING_128.get(CATALYTIC_ACTIVITY_CONCENTRATION_KATAL_PER_CUBIC_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(TIME_MINUTE_UNIT));
		assertEquals("time (minute)", UNIT_MAPPING_128.get(TIME_MINUTE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(TIME_HOUR_UNIT));
		assertEquals("time (hour)", UNIT_MAPPING_128.get(TIME_HOUR_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(TIME_DAY_UNIT));
		assertEquals("time (day)", UNIT_MAPPING_128.get(TIME_DAY_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PLANE_ANGLE_DEGREE_UNIT));
		assertEquals("plane angle (degree)", UNIT_MAPPING_128.get(PLANE_ANGLE_DEGREE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PLANE_ANGLE_MINUTE_UNIT));
		assertEquals("plane angle (minute)", UNIT_MAPPING_128.get(PLANE_ANGLE_MINUTE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PLANE_ANGLE_SECOND_UNIT));
		assertEquals("plane angle (second)", UNIT_MAPPING_128.get(PLANE_ANGLE_SECOND_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(AREA_HECTARE_UNIT));
		assertEquals("area (hectare)", UNIT_MAPPING_128.get(AREA_HECTARE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(VOLUME_LITRE_UNIT));
		assertEquals("volume (litre)", UNIT_MAPPING_128.get(VOLUME_LITRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MASS_TONNE_UNIT));
		assertEquals("mass (tonne)", UNIT_MAPPING_128.get(MASS_TONNE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PRESSURE_BAR_UNIT));
		assertEquals("pressure (bar)", UNIT_MAPPING_128.get(PRESSURE_BAR_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PRESSURE_MILLIMETRE_OF_MERCURY_UNIT));
		assertEquals("pressure (millimetre of mercury)", UNIT_MAPPING_128.get(PRESSURE_MILLIMETRE_OF_MERCURY_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LENGTH_ÅNGSTRöM_UNIT));
		assertEquals("length (ångström)", UNIT_MAPPING_128.get(LENGTH_ÅNGSTRöM_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LENGTH_NAUTICAL_MILE_UNIT));
		assertEquals("length (nautical mile)", UNIT_MAPPING_128.get(LENGTH_NAUTICAL_MILE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(AREA_BARN_UNIT));
		assertEquals("area (barn)", UNIT_MAPPING_128.get(AREA_BARN_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(VELOCITY_KNOT_UNIT));
		assertEquals("velocity (knot)", UNIT_MAPPING_128.get(VELOCITY_KNOT_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LOGARITHMIC_RADIO_QUANTITY_NEPER_UNIT));
		assertEquals("logarithmic radio quantity (neper)", UNIT_MAPPING_128.get(LOGARITHMIC_RADIO_QUANTITY_NEPER_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LOGARITHMIC_RADIO_QUANTITY_BEL_UNIT));
		assertEquals("logarithmic radio quantity (bel)", UNIT_MAPPING_128.get(LOGARITHMIC_RADIO_QUANTITY_BEL_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LENGTH_YARD_UNIT));
		assertEquals("length (yard)", UNIT_MAPPING_128.get(LENGTH_YARD_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LENGTH_PARSEC_UNIT));
		assertEquals("length (parsec)", UNIT_MAPPING_128.get(LENGTH_PARSEC_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LENGTH_INCH_UNIT));
		assertEquals("length (inch)", UNIT_MAPPING_128.get(LENGTH_INCH_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LENGTH_FOOT_UNIT));
		assertEquals("length (foot)", UNIT_MAPPING_128.get(LENGTH_FOOT_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LENGTH_MILE_UNIT));
		assertEquals("length (mile)", UNIT_MAPPING_128.get(LENGTH_MILE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PRESSURE_POUND_FORCE_PER_SQUARE_INCH_UNIT));
		assertEquals("pressure (pound-force per square inch)",
				UNIT_MAPPING_128.get(PRESSURE_POUND_FORCE_PER_SQUARE_INCH_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(VELOCITY_KILOMETRE_PER_HOUR_UNIT));
		assertEquals("velocity (kilometre per hour)", UNIT_MAPPING_128.get(VELOCITY_KILOMETRE_PER_HOUR_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(VELOCITY_MILE_PER_HOUR_UNIT));
		assertEquals("velocity (mile per hour)", UNIT_MAPPING_128.get(VELOCITY_MILE_PER_HOUR_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ANGULAR_VELOCITY_REVOLUTION_PER_MINUTE_UNIT));
		assertEquals("angular velocity (revolution per minute)",
				UNIT_MAPPING_128.get(ANGULAR_VELOCITY_REVOLUTION_PER_MINUTE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ENERGY_GRAM_CALORIE_UNIT));
		assertEquals("energy (gram calorie)", UNIT_MAPPING_128.get(ENERGY_GRAM_CALORIE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ENERGY_KILOGRAM_CALORIE_UNIT));
		assertEquals("energy (kilogram calorie)", UNIT_MAPPING_128.get(ENERGY_KILOGRAM_CALORIE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ENERGY_KILOWATT_HOUR_UNIT));
		assertEquals("energy (kilowatt hour)", UNIT_MAPPING_128.get(ENERGY_KILOWATT_HOUR_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(THERMODYNAMIC_TEMPERATURE_DEGREE_FAHRENHEIT_UNIT));
		assertEquals("thermodynamic temperature (degree Fahrenheit)",
				UNIT_MAPPING_128.get(THERMODYNAMIC_TEMPERATURE_DEGREE_FAHRENHEIT_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PERCENTAGE_UNIT));
		assertEquals("percentage", UNIT_MAPPING_128.get(PERCENTAGE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PER_MILLE_UNIT));
		assertEquals("per mille", UNIT_MAPPING_128.get(PER_MILLE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PERIOD_BEATS_PER_MINUTE_UNIT));
		assertEquals("period (beats per minute)", UNIT_MAPPING_128.get(PERIOD_BEATS_PER_MINUTE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ELECTRIC_CHARGE_AMPERE_HOURS_UNIT));
		assertEquals("electric charge (ampere hours)", UNIT_MAPPING_128.get(ELECTRIC_CHARGE_AMPERE_HOURS_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MASS_DENSITY_MILLIGRAM_PER_DECILITRE_UNIT));
		assertEquals("mass density (milligram per decilitre)",
				UNIT_MAPPING_128.get(MASS_DENSITY_MILLIGRAM_PER_DECILITRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MASS_DENSITY_MILLIMOLE_PER_LITRE_UNIT));
		assertEquals("mass density (millimole per litre)", UNIT_MAPPING_128.get(MASS_DENSITY_MILLIMOLE_PER_LITRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(TIME_YEAR_UNIT));
		assertEquals("time (year)", UNIT_MAPPING_128.get(TIME_YEAR_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(TIME_MONTH_UNIT));
		assertEquals("time (month)", UNIT_MAPPING_128.get(TIME_MONTH_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(CONCENTRATION_COUNT_PER_CUBIC_METRE_UNIT));
		assertEquals("concentration (count per cubic metre)",
				UNIT_MAPPING_128.get(CONCENTRATION_COUNT_PER_CUBIC_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(IRRADIANCE_WATT_PER_SQUARE_METRE_UNIT));
		assertEquals("irradiance (watt per square metre)", UNIT_MAPPING_128.get(IRRADIANCE_WATT_PER_SQUARE_METRE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(TRANSFER_RATE_MILLILITER_PER_KILOGRAM_PER_MINUTE_UNIT));
		assertEquals("milliliter (per kilogram per minute)",
				UNIT_MAPPING_128.get(TRANSFER_RATE_MILLILITER_PER_KILOGRAM_PER_MINUTE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MASS_POUND_UNIT));
		assertEquals("mass (pound)", UNIT_MAPPING_128.get(MASS_POUND_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(METABOLIC_EQUIVALENT_UNIT));
		assertEquals("metabolic equivalent", UNIT_MAPPING_128.get(METABOLIC_EQUIVALENT_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(STEP_PER_MINUTE_UNIT));
		assertEquals("step (per minute)", UNIT_MAPPING_128.get(STEP_PER_MINUTE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(STROKE_PER_MINUTE_UNIT));
		assertEquals("stroke (per minute)", UNIT_MAPPING_128.get(STROKE_PER_MINUTE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(VELOCITY_KILOMETER_PER_MINUTE_UNIT));
		assertEquals("pace (kilometre per minute)", UNIT_MAPPING_128.get(VELOCITY_KILOMETER_PER_MINUTE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LUMINOUS_EFFICACY_LUMEN_PER_WATT_UNIT));
		assertEquals("luminous efficacy (lumen per watt)", UNIT_MAPPING_128.get(LUMINOUS_EFFICACY_LUMEN_PER_WATT_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LUMINOUS_ENERGY_LUMEN_HOUR_UNIT));
		assertEquals("luminous energy (lumen hour)", UNIT_MAPPING_128.get(LUMINOUS_ENERGY_LUMEN_HOUR_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(LUMINOUS_EXPOSURE_LUX_HOUR_UNIT));
		assertEquals("luminous exposure (lux hour)", UNIT_MAPPING_128.get(LUMINOUS_EXPOSURE_LUX_HOUR_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MASS_FLOW_GRAM_PER_SECOND_UNIT));
		assertEquals("mass flow (gram per second)", UNIT_MAPPING_128.get(MASS_FLOW_GRAM_PER_SECOND_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(VOLUME_FLOW_LITRE_PER_SECOND_UNIT));
		assertEquals("volume flow (litre per second)", UNIT_MAPPING_128.get(VOLUME_FLOW_LITRE_PER_SECOND_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(SOUND_PRESSURE_DECIBEL_SPL_UNIT));
		assertEquals("sound pressure (decibel)", UNIT_MAPPING_128.get(SOUND_PRESSURE_DECIBEL_SPL_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PPM_UNIT));
		assertEquals("parts per million", UNIT_MAPPING_128.get(PPM_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(PPB_UNIT));
		assertEquals("parts per billion", UNIT_MAPPING_128.get(PPB_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(MASS_DENSITY_RATE_MILLIGRAM_PER_DECILITRE_PER_MINUTE_UNIT));
		assertEquals("mass density rate ((milligram per decilitre) per minute)",
				UNIT_MAPPING_128.get(MASS_DENSITY_RATE_MILLIGRAM_PER_DECILITRE_PER_MINUTE_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(ENERGY_KILOVOLT_AMPERE_HOUR_UNIT));
		assertEquals("Electrical Apparent Energy (kilovolt ampere hour)",
				UNIT_MAPPING_128.get(ENERGY_KILOVOLT_AMPERE_HOUR_UNIT));
		assertTrue(UNIT_MAPPING_128.containsKey(POWER_VOLT_AMPERE_UNIT));
		assertEquals("Electrical Apparent Power (volt ampere)", UNIT_MAPPING_128.get(POWER_VOLT_AMPERE_UNIT));
	}

}