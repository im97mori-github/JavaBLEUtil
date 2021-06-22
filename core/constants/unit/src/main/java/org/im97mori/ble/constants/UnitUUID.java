package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT Unit UUID
 */
public class UnitUUID {

    @SuppressWarnings("serial")
    private static final class Map128 extends HashMap<UUID, String> {

        private Map128() {
            super();
            put(UNITLESS_UNIT, "unitless");
            put(LENGTH_METRE_UNIT, "length (metre)");
            put(MASS_KILOGRAM_UNIT, "mass (kilogram)");
            put(TIME_SECOND_UNIT, "time (second)");
            put(ELECTRIC_CURRENT_AMPERE_UNIT, "electric current (ampere)");
            put(THERMODYNAMIC_TEMPERATURE_KELVIN_UNIT, "thermodynamic temperature (kelvin)");
            put(AMOUNT_OF_SUBSTANCE_MOLE_UNIT, "amount of substance (mole)");
            put(LUMINOUS_INTENSITY_CANDELA_UNIT, "luminous intensity (candela)");
            put(AREA_SQUARE_METRES_UNIT, "area (square metres)");
            put(VOLUME_CUBIC_METRES_UNIT, "volume (cubic metres)");
            put(VELOCITY_METRES_PER_SECOND_UNIT, "velocity (metres per second)");
            put(ACCELERATION_METRES_PER_SECOND_SQUARED_UNIT, "acceleration (metres per second squared)");
            put(WAVENUMBER_RECIPROCAL_METRE_UNIT, "wavenumber (reciprocal metre)");
            put(DENSITY_KILOGRAM_PER_CUBIC_METRE_UNIT, "density (kilogram per cubic metre)");
            put(SURFACE_DENSITY_KILOGRAM_PER_SQUARE_METRE_UNIT, "surface density (kilogram per square metre)");
            put(SPECIFIC_VOLUME_CUBIC_METRE_PER_KILOGRAM_UNIT, "specific volume (cubic metre per kilogram)");
            put(CURRENT_DENSITY_AMPERE_PER_SQUARE_METRE_UNIT, "current density (ampere per square metre)");
            put(MAGNETIC_FIELD_STRENGTH_AMPERE_PER_METRE_UNIT, "magnetic field strength (ampere per metre)");
            put(AMOUNT_CONCENTRATION_MOLE_PER_CUBIC_METRE_UNIT, "amount concentration (mole per cubic metre)");
            put(MASS_CONCENTRATION_KILOGRAM_PER_CUBIC_METRE_UNIT, "mass concentration (kilogram per cubic metre)");
            put(LUMINANCE_CANDELA_PER_SQUARE_METRE_UNIT, "luminance (candela per square metre)");
            put(REFRACTIVE_INDEX_UNIT, "refractive index");
            put(RELATIVE_PERMEABILITY_UNIT, "relative permeability");
            put(PLANE_ANGLE_RADIAN_UNIT, "plane angle (radian)");
            put(SOLID_ANGLE_STERADIAN_UNIT, "solid angle (steradian)");
            put(FREQUENCY_HERTZ_UNIT, "frequency (hertz)");
            put(FORCE_NEWTON_UNIT, "force (newton)");
            put(PRESSURE_PASCAL_UNIT, "pressure (pascal)");
            put(ENERGY_JOULE_UNIT, "energy (joule)");
            put(POWER_WATT_UNIT, "power (watt)");
            put(ELECTRIC_CHARGE_COULOMB_UNIT, "electric charge (coulomb)");
            put(ELECTRIC_POTENTIAL_DIFFERENCE_VOLT_UNIT, "electric potential difference (volt)");
            put(CAPACITANCE_FARAD_UNIT, "capacitance (farad)");
            put(ELECTRIC_RESISTANCE_OHM_UNIT, "electric resistance (ohm)");
            put(ELECTRIC_CONDUCTANCE_SIEMENS_UNIT, "electric conductance (siemens)");
            put(MAGNETIC_FLUX_WEBER_UNIT, "magnetic flux (weber)");
            put(MAGNETIC_FLUX_DENSITY_TESLA_UNIT, "magnetic flux density (tesla)");
            put(INDUCTANCE_HENRY_UNIT, "inductance (henry)");
            put(THERMODYNAMIC_TEMPERATURE_DEGREE_CELSIUS_UNIT, "Celsius temperature (degree Celsius)");
            put(LUMINOUS_FLUX_LUMEN_UNIT, "luminous flux (lumen)");
            put(ILLUMINANCE_LUX_UNIT, "illuminance (lux)");
            put(ACTIVITY_REFERRED_TO_A_RADIONUCLIDE_BECQUEREL_UNIT, "activity referred to a radionuclide (becquerel)");
            put(ABSORBED_DOSE_GRAY_UNIT, "absorbed dose (gray)");
            put(DOSE_EQUIVALENT_SIEVERT_UNIT, "dose equivalent (sievert)");
            put(CATALYTIC_ACTIVITY_KATAL_UNIT, "catalytic activity (katal)");
            put(DYNAMIC_VISCOSITY_PASCAL_SECOND_UNIT, "dynamic viscosity (pascal second)");
            put(MOMENT_OF_FORCE_NEWTON_METRE_UNIT, "moment of force (newton metre)");
            put(SURFACE_TENSION_NEWTON_PER_METRE_UNIT, "surface tension (newton per metre)");
            put(ANGULAR_VELOCITY_RADIAN_PER_SECOND_UNIT, "angular velocity (radian per second)");
            put(ANGULAR_ACCELERATION_RADIAN_PER_SECOND_SQUARED_UNIT, "angular acceleration (radian per second squared)");
            put(HEAT_FLUX_DENSITY_WATT_PER_SQUARE_METRE_UNIT, "heat flux density (watt per square metre)");
            put(HEAT_CAPACITY_JOULE_PER_KELVIN_UNIT, "heat capacity (joule per kelvin)");
            put(SPECIFIC_HEAT_CAPACITY_JOULE_PER_KILOGRAM_KELVIN_UNIT, "specific heat capacity (joule per kilogram kelvin)");
            put(SPECIFIC_ENERGY_JOULE_PER_KILOGRAM_UNIT, "specific energy (joule per kilogram)");
            put(THERMAL_CONDUCTIVITY_WATT_PER_METRE_KELVIN_UNIT, "thermal conductivity (watt per metre kelvin)");
            put(ENERGY_DENSITY_JOULE_PER_CUBIC_METRE_UNIT, "energy density (joule per cubic metre)");
            put(ELECTRIC_FIELD_STRENGTH_VOLT_PER_METRE_UNIT, "electric field strength (volt per metre)");
            put(ELECTRIC_CHARGE_DENSITY_COULOMB_PER_CUBIC_METRE_UNIT, "electric charge density (coulomb per cubic metre)");
            put(SURFACE_CHARGE_DENSITY_COULOMB_PER_SQUARE_METRE_UNIT, "surface charge density (coulomb per square metre)");
            put(ELECTRIC_FLUX_DENSITY_COULOMB_PER_SQUARE_METRE_UNIT, "electric flux density (coulomb per square metre)");
            put(PERMITTIVITY_FARAD_PER_METRE_UNIT, "permittivity (farad per metre)");
            put(PERMEABILITY_HENRY_PER_METRE_UNIT, "permeability (henry per metre)");
            put(MOLAR_ENERGY_JOULE_PER_MOLE_UNIT, "molar energy (joule per mole)");
            put(MOLAR_ENTROPY_JOULE_PER_MOLE_KELVIN_UNIT, "molar entropy (joule per mole kelvin)");
            put(EXPOSURE_COULOMB_PER_KILOGRAM_UNIT, "exposure (coulomb per kilogram)");
            put(ABSORBED_DOSE_RATE_GRAY_PER_SECOND_UNIT, "absorbed dose rate (gray per second)");
            put(RADIANT_INTENSITY_WATT_PER_STERADIAN_UNIT, "radiant intensity (watt per steradian)");
            put(RADIANCE_WATT_PER_SQUARE_METRE_STERADIAN_UNIT, "radiance (watt per square metre steradian)");
            put(CATALYTIC_ACTIVITY_CONCENTRATION_KATAL_PER_CUBIC_METRE_UNIT, "catalytic activity concentration (katal per cubic metre)");
            put(TIME_MINUTE_UNIT, "time (minute)");
            put(TIME_HOUR_UNIT, "time (hour)");
            put(TIME_DAY_UNIT, "time (day)");
            put(PLANE_ANGLE_DEGREE_UNIT, "plane angle (degree)");
            put(PLANE_ANGLE_MINUTE_UNIT, "plane angle (minute)");
            put(PLANE_ANGLE_SECOND_UNIT, "plane angle (second)");
            put(AREA_HECTARE_UNIT, "area (hectare)");
            put(VOLUME_LITRE_UNIT, "volume (litre)");
            put(MASS_TONNE_UNIT, "mass (tonne)");
            put(PRESSURE_BAR_UNIT, "pressure (bar)");
            put(PRESSURE_MILLIMETRE_OF_MERCURY_UNIT, "pressure (millimetre of mercury)");
            put(LENGTH_åNGSTRöM_UNIT, "length (ångström)");
            put(LENGTH_NAUTICAL_MILE_UNIT, "length (nautical mile)");
            put(AREA_BARN_UNIT, "area (barn)");
            put(VELOCITY_KNOT_UNIT, "velocity (knot)");
            put(LOGARITHMIC_RADIO_QUANTITY_NEPER_UNIT, "logarithmic radio quantity (neper)");
            put(LOGARITHMIC_RADIO_QUANTITY_BEL_UNIT, "logarithmic radio quantity (bel)");
            put(LENGTH_YARD_UNIT, "length (yard)");
            put(LENGTH_PARSEC_UNIT, "length (parsec)");
            put(LENGTH_INCH_UNIT, "length (inch)");
            put(LENGTH_FOOT_UNIT, "length (foot)");
            put(LENGTH_MILE_UNIT, "length (mile)");
            put(PRESSURE_POUND_FORCE_PER_SQUARE_INCH_UNIT, "pressure (pound-force per square inch)");
            put(VELOCITY_KILOMETRE_PER_HOUR_UNIT, "velocity (kilometre per hour)");
            put(VELOCITY_MILE_PER_HOUR_UNIT, "velocity (mile per hour)");
            put(ANGULAR_VELOCITY_REVOLUTION_PER_MINUTE_UNIT, "angular velocity (revolution per minute)");
            put(ENERGY_GRAM_CALORIE_UNIT, "energy (gram calorie)");
            put(ENERGY_KILOGRAM_CALORIE_UNIT, "energy (kilogram calorie)");
            put(ENERGY_KILOWATT_HOUR_UNIT, "energy (kilowatt hour)");
            put(THERMODYNAMIC_TEMPERATURE_DEGREE_FAHRENHEIT_UNIT, "thermodynamic temperature (degree Fahrenheit)");
            put(PERCENTAGE_UNIT, "percentage");
            put(PER_MILLE_UNIT, "per mille");
            put(PERIOD_BEATS_PER_MINUTE_UNIT, "period (beats per minute)");
            put(ELECTRIC_CHARGE_AMPERE_HOURS_UNIT, "electric charge (ampere hours)");
            put(MASS_DENSITY_MILLIGRAM_PER_DECILITRE_UNIT, "mass density (milligram per decilitre)");
            put(MASS_DENSITY_MILLIMOLE_PER_LITRE_UNIT, "mass density (millimole per litre)");
            put(TIME_YEAR_UNIT, "time (year)");
            put(TIME_MONTH_UNIT, "time (month)");
            put(CONCENTRATION_COUNT_PER_CUBIC_METRE_UNIT, "concentration (count per cubic metre)");
            put(IRRADIANCE_WATT_PER_SQUARE_METRE_UNIT, "irradiance (watt per square metre)");
            put(TRANSFER_RATE_MILLILITER_PER_KILOGRAM_PER_MINUTE_UNIT, "milliliter (per kilogram per minute)");
            put(MASS_POUND_UNIT, "mass (pound)");
            put(METABOLIC_EQUIVALENT_UNIT, "metabolic equivalent");
            put(STEP_PER_MINUTE_UNIT, "step (per minute)");
            put(STROKE_PER_MINUTE_UNIT, "stroke (per minute)");
            put(VELOCITY_KILOMETER_PER_MINUTE_UNIT, "pace (kilometre per minute)");
            put(LUMINOUS_EFFICACY_LUMEN_PER_WATT_UNIT, "luminous efficacy (lumen per watt)");
            put(LUMINOUS_ENERGY_LUMEN_HOUR_UNIT, "luminous energy (lumen hour)");
            put(LUMINOUS_EXPOSURE_LUX_HOUR_UNIT, "luminous exposure (lux hour)");
            put(MASS_FLOW_GRAM_PER_SECOND_UNIT, "mass flow (gram per second)");
            put(VOLUME_FLOW_LITRE_PER_SECOND_UNIT, "volume flow (litre per second)");
            put(SOUND_PRESSURE_DECIBEL_SPL_UNIT, "sound pressure (decibel)");
            put(CONCENTRATION_PARTS_PER_MILLION_UNIT, "concentration (parts per million)");
            put(CONCENTRATION_PARTS_PER_BILLION_UNIT, "concentration (parts per billion)");

        }
    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> UNIT_MAPPING_128 = Collections.synchronizedMap(Collections.unmodifiableMap(new Map128()));

    /**
     * unitless (Unit UUID: 0x2700)
     */
    public static final UUID UNITLESS_UNIT = UUID.fromString("00002700-0000-1000-8000-00805f9b34fb");

    /**
     * length (metre) (Unit UUID: 0x2701)
     */
    public static final UUID LENGTH_METRE_UNIT = UUID.fromString("00002701-0000-1000-8000-00805f9b34fb");

    /**
     * mass (kilogram) (Unit UUID: 0x2702)
     */
    public static final UUID MASS_KILOGRAM_UNIT = UUID.fromString("00002702-0000-1000-8000-00805f9b34fb");

    /**
     * time (second) (Unit UUID: 0x2703)
     */
    public static final UUID TIME_SECOND_UNIT = UUID.fromString("00002703-0000-1000-8000-00805f9b34fb");

    /**
     * electric current (ampere) (Unit UUID: 0x2704)
     */
    public static final UUID ELECTRIC_CURRENT_AMPERE_UNIT = UUID.fromString("00002704-0000-1000-8000-00805f9b34fb");

    /**
     * thermodynamic temperature (kelvin) (Unit UUID: 0x2705)
     */
    public static final UUID THERMODYNAMIC_TEMPERATURE_KELVIN_UNIT = UUID.fromString("00002705-0000-1000-8000-00805f9b34fb");

    /**
     * amount of substance (mole) (Unit UUID: 0x2706)
     */
    public static final UUID AMOUNT_OF_SUBSTANCE_MOLE_UNIT = UUID.fromString("00002706-0000-1000-8000-00805f9b34fb");

    /**
     * luminous intensity (candela) (Unit UUID: 0x2707)
     */
    public static final UUID LUMINOUS_INTENSITY_CANDELA_UNIT = UUID.fromString("00002707-0000-1000-8000-00805f9b34fb");

    /**
     * area (square metres) (Unit UUID: 0x2710)
     */
    public static final UUID AREA_SQUARE_METRES_UNIT = UUID.fromString("00002710-0000-1000-8000-00805f9b34fb");

    /**
     * volume (cubic metres) (Unit UUID: 0x2711)
     */
    public static final UUID VOLUME_CUBIC_METRES_UNIT = UUID.fromString("00002711-0000-1000-8000-00805f9b34fb");

    /**
     * velocity (metres per second) (Unit UUID: 0x2712)
     */
    public static final UUID VELOCITY_METRES_PER_SECOND_UNIT = UUID.fromString("00002712-0000-1000-8000-00805f9b34fb");

    /**
     * acceleration (metres per second squared) (Unit UUID: 0x2713)
     */
    public static final UUID ACCELERATION_METRES_PER_SECOND_SQUARED_UNIT = UUID.fromString("00002713-0000-1000-8000-00805f9b34fb");

    /**
     * wavenumber (reciprocal metre) (Unit UUID: 0x2714)
     */
    public static final UUID WAVENUMBER_RECIPROCAL_METRE_UNIT = UUID.fromString("00002714-0000-1000-8000-00805f9b34fb");

    /**
     * density (kilogram per cubic metre) (Unit UUID: 0x2715)
     */
    public static final UUID DENSITY_KILOGRAM_PER_CUBIC_METRE_UNIT = UUID.fromString("00002715-0000-1000-8000-00805f9b34fb");

    /**
     * surface density (kilogram per square metre) (Unit UUID: 0x2716)
     */
    public static final UUID SURFACE_DENSITY_KILOGRAM_PER_SQUARE_METRE_UNIT = UUID.fromString("00002716-0000-1000-8000-00805f9b34fb");

    /**
     * specific volume (cubic metre per kilogram) (Unit UUID: 0x2717)
     */
    public static final UUID SPECIFIC_VOLUME_CUBIC_METRE_PER_KILOGRAM_UNIT = UUID.fromString("00002717-0000-1000-8000-00805f9b34fb");

    /**
     * current density (ampere per square metre) (Unit UUID: 0x2718)
     */
    public static final UUID CURRENT_DENSITY_AMPERE_PER_SQUARE_METRE_UNIT = UUID.fromString("00002718-0000-1000-8000-00805f9b34fb");

    /**
     * magnetic field strength (ampere per metre) (Unit UUID: 0x2719)
     */
    public static final UUID MAGNETIC_FIELD_STRENGTH_AMPERE_PER_METRE_UNIT = UUID.fromString("00002719-0000-1000-8000-00805f9b34fb");

    /**
     * amount concentration (mole per cubic metre) (Unit UUID: 0x271a)
     */
    public static final UUID AMOUNT_CONCENTRATION_MOLE_PER_CUBIC_METRE_UNIT = UUID.fromString("0000271a-0000-1000-8000-00805f9b34fb");

    /**
     * mass concentration (kilogram per cubic metre) (Unit UUID: 0x271b)
     */
    public static final UUID MASS_CONCENTRATION_KILOGRAM_PER_CUBIC_METRE_UNIT = UUID.fromString("0000271b-0000-1000-8000-00805f9b34fb");

    /**
     * luminance (candela per square metre) (Unit UUID: 0x271c)
     */
    public static final UUID LUMINANCE_CANDELA_PER_SQUARE_METRE_UNIT = UUID.fromString("0000271c-0000-1000-8000-00805f9b34fb");

    /**
     * refractive index (Unit UUID: 0x271d)
     */
    public static final UUID REFRACTIVE_INDEX_UNIT = UUID.fromString("0000271d-0000-1000-8000-00805f9b34fb");

    /**
     * relative permeability (Unit UUID: 0x271e)
     */
    public static final UUID RELATIVE_PERMEABILITY_UNIT = UUID.fromString("0000271e-0000-1000-8000-00805f9b34fb");

    /**
     * plane angle (radian) (Unit UUID: 0x2720)
     */
    public static final UUID PLANE_ANGLE_RADIAN_UNIT = UUID.fromString("00002720-0000-1000-8000-00805f9b34fb");

    /**
     * solid angle (steradian) (Unit UUID: 0x2721)
     */
    public static final UUID SOLID_ANGLE_STERADIAN_UNIT = UUID.fromString("00002721-0000-1000-8000-00805f9b34fb");

    /**
     * frequency (hertz) (Unit UUID: 0x2722)
     */
    public static final UUID FREQUENCY_HERTZ_UNIT = UUID.fromString("00002722-0000-1000-8000-00805f9b34fb");

    /**
     * force (newton) (Unit UUID: 0x2723)
     */
    public static final UUID FORCE_NEWTON_UNIT = UUID.fromString("00002723-0000-1000-8000-00805f9b34fb");

    /**
     * pressure (pascal) (Unit UUID: 0x2724)
     */
    public static final UUID PRESSURE_PASCAL_UNIT = UUID.fromString("00002724-0000-1000-8000-00805f9b34fb");

    /**
     * energy (joule) (Unit UUID: 0x2725)
     */
    public static final UUID ENERGY_JOULE_UNIT = UUID.fromString("00002725-0000-1000-8000-00805f9b34fb");

    /**
     * power (watt) (Unit UUID: 0x2726)
     */
    public static final UUID POWER_WATT_UNIT = UUID.fromString("00002726-0000-1000-8000-00805f9b34fb");

    /**
     * electric charge (coulomb) (Unit UUID: 0x2727)
     */
    public static final UUID ELECTRIC_CHARGE_COULOMB_UNIT = UUID.fromString("00002727-0000-1000-8000-00805f9b34fb");

    /**
     * electric potential difference (volt) (Unit UUID: 0x2728)
     */
    public static final UUID ELECTRIC_POTENTIAL_DIFFERENCE_VOLT_UNIT = UUID.fromString("00002728-0000-1000-8000-00805f9b34fb");

    /**
     * capacitance (farad) (Unit UUID: 0x2729)
     */
    public static final UUID CAPACITANCE_FARAD_UNIT = UUID.fromString("00002729-0000-1000-8000-00805f9b34fb");

    /**
     * electric resistance (ohm) (Unit UUID: 0x272a)
     */
    public static final UUID ELECTRIC_RESISTANCE_OHM_UNIT = UUID.fromString("0000272a-0000-1000-8000-00805f9b34fb");

    /**
     * electric conductance (siemens) (Unit UUID: 0x272b)
     */
    public static final UUID ELECTRIC_CONDUCTANCE_SIEMENS_UNIT = UUID.fromString("0000272b-0000-1000-8000-00805f9b34fb");

    /**
     * magnetic flux (weber) (Unit UUID: 0x272c)
     */
    public static final UUID MAGNETIC_FLUX_WEBER_UNIT = UUID.fromString("0000272c-0000-1000-8000-00805f9b34fb");

    /**
     * magnetic flux density (tesla) (Unit UUID: 0x272d)
     */
    public static final UUID MAGNETIC_FLUX_DENSITY_TESLA_UNIT = UUID.fromString("0000272d-0000-1000-8000-00805f9b34fb");

    /**
     * inductance (henry) (Unit UUID: 0x272e)
     */
    public static final UUID INDUCTANCE_HENRY_UNIT = UUID.fromString("0000272e-0000-1000-8000-00805f9b34fb");

    /**
     * Celsius temperature (degree Celsius) (Unit UUID: 0x272f)
     */
    public static final UUID THERMODYNAMIC_TEMPERATURE_DEGREE_CELSIUS_UNIT = UUID.fromString("0000272f-0000-1000-8000-00805f9b34fb");

    /**
     * luminous flux (lumen) (Unit UUID: 0x2730)
     */
    public static final UUID LUMINOUS_FLUX_LUMEN_UNIT = UUID.fromString("00002730-0000-1000-8000-00805f9b34fb");

    /**
     * illuminance (lux) (Unit UUID: 0x2731)
     */
    public static final UUID ILLUMINANCE_LUX_UNIT = UUID.fromString("00002731-0000-1000-8000-00805f9b34fb");

    /**
     * activity referred to a radionuclide (becquerel) (Unit UUID: 0x2732)
     */
    public static final UUID ACTIVITY_REFERRED_TO_A_RADIONUCLIDE_BECQUEREL_UNIT = UUID.fromString("00002732-0000-1000-8000-00805f9b34fb");

    /**
     * absorbed dose (gray) (Unit UUID: 0x2733)
     */
    public static final UUID ABSORBED_DOSE_GRAY_UNIT = UUID.fromString("00002733-0000-1000-8000-00805f9b34fb");

    /**
     * dose equivalent (sievert) (Unit UUID: 0x2734)
     */
    public static final UUID DOSE_EQUIVALENT_SIEVERT_UNIT = UUID.fromString("00002734-0000-1000-8000-00805f9b34fb");

    /**
     * catalytic activity (katal) (Unit UUID: 0x2735)
     */
    public static final UUID CATALYTIC_ACTIVITY_KATAL_UNIT = UUID.fromString("00002735-0000-1000-8000-00805f9b34fb");

    /**
     * dynamic viscosity (pascal second) (Unit UUID: 0x2740)
     */
    public static final UUID DYNAMIC_VISCOSITY_PASCAL_SECOND_UNIT = UUID.fromString("00002740-0000-1000-8000-00805f9b34fb");

    /**
     * moment of force (newton metre) (Unit UUID: 0x2741)
     */
    public static final UUID MOMENT_OF_FORCE_NEWTON_METRE_UNIT = UUID.fromString("00002741-0000-1000-8000-00805f9b34fb");

    /**
     * surface tension (newton per metre) (Unit UUID: 0x2742)
     */
    public static final UUID SURFACE_TENSION_NEWTON_PER_METRE_UNIT = UUID.fromString("00002742-0000-1000-8000-00805f9b34fb");

    /**
     * angular velocity (radian per second) (Unit UUID: 0x2743)
     */
    public static final UUID ANGULAR_VELOCITY_RADIAN_PER_SECOND_UNIT = UUID.fromString("00002743-0000-1000-8000-00805f9b34fb");

    /**
     * angular acceleration (radian per second squared) (Unit UUID: 0x2744)
     */
    public static final UUID ANGULAR_ACCELERATION_RADIAN_PER_SECOND_SQUARED_UNIT = UUID.fromString("00002744-0000-1000-8000-00805f9b34fb");

    /**
     * heat flux density (watt per square metre) (Unit UUID: 0x2745)
     */
    public static final UUID HEAT_FLUX_DENSITY_WATT_PER_SQUARE_METRE_UNIT = UUID.fromString("00002745-0000-1000-8000-00805f9b34fb");

    /**
     * heat capacity (joule per kelvin) (Unit UUID: 0x2746)
     */
    public static final UUID HEAT_CAPACITY_JOULE_PER_KELVIN_UNIT = UUID.fromString("00002746-0000-1000-8000-00805f9b34fb");

    /**
     * specific heat capacity (joule per kilogram kelvin) (Unit UUID: 0x2747)
     */
    public static final UUID SPECIFIC_HEAT_CAPACITY_JOULE_PER_KILOGRAM_KELVIN_UNIT = UUID.fromString("00002747-0000-1000-8000-00805f9b34fb");

    /**
     * specific energy (joule per kilogram) (Unit UUID: 0x2748)
     */
    public static final UUID SPECIFIC_ENERGY_JOULE_PER_KILOGRAM_UNIT = UUID.fromString("00002748-0000-1000-8000-00805f9b34fb");

    /**
     * thermal conductivity (watt per metre kelvin) (Unit UUID: 0x2749)
     */
    public static final UUID THERMAL_CONDUCTIVITY_WATT_PER_METRE_KELVIN_UNIT = UUID.fromString("00002749-0000-1000-8000-00805f9b34fb");

    /**
     * energy density (joule per cubic metre) (Unit UUID: 0x274a)
     */
    public static final UUID ENERGY_DENSITY_JOULE_PER_CUBIC_METRE_UNIT = UUID.fromString("0000274a-0000-1000-8000-00805f9b34fb");

    /**
     * electric field strength (volt per metre) (Unit UUID: 0x274b)
     */
    public static final UUID ELECTRIC_FIELD_STRENGTH_VOLT_PER_METRE_UNIT = UUID.fromString("0000274b-0000-1000-8000-00805f9b34fb");

    /**
     * electric charge density (coulomb per cubic metre) (Unit UUID: 0x274c)
     */
    public static final UUID ELECTRIC_CHARGE_DENSITY_COULOMB_PER_CUBIC_METRE_UNIT = UUID.fromString("0000274c-0000-1000-8000-00805f9b34fb");

    /**
     * surface charge density (coulomb per square metre) (Unit UUID: 0x274d)
     */
    public static final UUID SURFACE_CHARGE_DENSITY_COULOMB_PER_SQUARE_METRE_UNIT = UUID.fromString("0000274d-0000-1000-8000-00805f9b34fb");

    /**
     * electric flux density (coulomb per square metre) (Unit UUID: 0x274e)
     */
    public static final UUID ELECTRIC_FLUX_DENSITY_COULOMB_PER_SQUARE_METRE_UNIT = UUID.fromString("0000274e-0000-1000-8000-00805f9b34fb");

    /**
     * permittivity (farad per metre) (Unit UUID: 0x274f)
     */
    public static final UUID PERMITTIVITY_FARAD_PER_METRE_UNIT = UUID.fromString("0000274f-0000-1000-8000-00805f9b34fb");

    /**
     * permeability (henry per metre) (Unit UUID: 0x2750)
     */
    public static final UUID PERMEABILITY_HENRY_PER_METRE_UNIT = UUID.fromString("00002750-0000-1000-8000-00805f9b34fb");

    /**
     * molar energy (joule per mole) (Unit UUID: 0x2751)
     */
    public static final UUID MOLAR_ENERGY_JOULE_PER_MOLE_UNIT = UUID.fromString("00002751-0000-1000-8000-00805f9b34fb");

    /**
     * molar entropy (joule per mole kelvin) (Unit UUID: 0x2752)
     */
    public static final UUID MOLAR_ENTROPY_JOULE_PER_MOLE_KELVIN_UNIT = UUID.fromString("00002752-0000-1000-8000-00805f9b34fb");

    /**
     * exposure (coulomb per kilogram) (Unit UUID: 0x2753)
     */
    public static final UUID EXPOSURE_COULOMB_PER_KILOGRAM_UNIT = UUID.fromString("00002753-0000-1000-8000-00805f9b34fb");

    /**
     * absorbed dose rate (gray per second) (Unit UUID: 0x2754)
     */
    public static final UUID ABSORBED_DOSE_RATE_GRAY_PER_SECOND_UNIT = UUID.fromString("00002754-0000-1000-8000-00805f9b34fb");

    /**
     * radiant intensity (watt per steradian) (Unit UUID: 0x2755)
     */
    public static final UUID RADIANT_INTENSITY_WATT_PER_STERADIAN_UNIT = UUID.fromString("00002755-0000-1000-8000-00805f9b34fb");

    /**
     * radiance (watt per square metre steradian) (Unit UUID: 0x2756)
     */
    public static final UUID RADIANCE_WATT_PER_SQUARE_METRE_STERADIAN_UNIT = UUID.fromString("00002756-0000-1000-8000-00805f9b34fb");

    /**
     * catalytic activity concentration (katal per cubic metre) (Unit UUID: 0x2757)
     */
    public static final UUID CATALYTIC_ACTIVITY_CONCENTRATION_KATAL_PER_CUBIC_METRE_UNIT = UUID.fromString("00002757-0000-1000-8000-00805f9b34fb");

    /**
     * time (minute) (Unit UUID: 0x2760)
     */
    public static final UUID TIME_MINUTE_UNIT = UUID.fromString("00002760-0000-1000-8000-00805f9b34fb");

    /**
     * time (hour) (Unit UUID: 0x2761)
     */
    public static final UUID TIME_HOUR_UNIT = UUID.fromString("00002761-0000-1000-8000-00805f9b34fb");

    /**
     * time (day) (Unit UUID: 0x2762)
     */
    public static final UUID TIME_DAY_UNIT = UUID.fromString("00002762-0000-1000-8000-00805f9b34fb");

    /**
     * plane angle (degree) (Unit UUID: 0x2763)
     */
    public static final UUID PLANE_ANGLE_DEGREE_UNIT = UUID.fromString("00002763-0000-1000-8000-00805f9b34fb");

    /**
     * plane angle (minute) (Unit UUID: 0x2764)
     */
    public static final UUID PLANE_ANGLE_MINUTE_UNIT = UUID.fromString("00002764-0000-1000-8000-00805f9b34fb");

    /**
     * plane angle (second) (Unit UUID: 0x2765)
     */
    public static final UUID PLANE_ANGLE_SECOND_UNIT = UUID.fromString("00002765-0000-1000-8000-00805f9b34fb");

    /**
     * area (hectare) (Unit UUID: 0x2766)
     */
    public static final UUID AREA_HECTARE_UNIT = UUID.fromString("00002766-0000-1000-8000-00805f9b34fb");

    /**
     * volume (litre) (Unit UUID: 0x2767)
     */
    public static final UUID VOLUME_LITRE_UNIT = UUID.fromString("00002767-0000-1000-8000-00805f9b34fb");

    /**
     * mass (tonne) (Unit UUID: 0x2768)
     */
    public static final UUID MASS_TONNE_UNIT = UUID.fromString("00002768-0000-1000-8000-00805f9b34fb");

    /**
     * pressure (bar) (Unit UUID: 0x2780)
     */
    public static final UUID PRESSURE_BAR_UNIT = UUID.fromString("00002780-0000-1000-8000-00805f9b34fb");

    /**
     * pressure (millimetre of mercury) (Unit UUID: 0x2781)
     */
    public static final UUID PRESSURE_MILLIMETRE_OF_MERCURY_UNIT = UUID.fromString("00002781-0000-1000-8000-00805f9b34fb");

    /**
     * length (ångström) (Unit UUID: 0x2782)
     */
    public static final UUID LENGTH_åNGSTRöM_UNIT = UUID.fromString("00002782-0000-1000-8000-00805f9b34fb");

    /**
     * length (nautical mile) (Unit UUID: 0x2783)
     */
    public static final UUID LENGTH_NAUTICAL_MILE_UNIT = UUID.fromString("00002783-0000-1000-8000-00805f9b34fb");

    /**
     * area (barn) (Unit UUID: 0x2784)
     */
    public static final UUID AREA_BARN_UNIT = UUID.fromString("00002784-0000-1000-8000-00805f9b34fb");

    /**
     * velocity (knot) (Unit UUID: 0x2785)
     */
    public static final UUID VELOCITY_KNOT_UNIT = UUID.fromString("00002785-0000-1000-8000-00805f9b34fb");

    /**
     * logarithmic radio quantity (neper) (Unit UUID: 0x2786)
     */
    public static final UUID LOGARITHMIC_RADIO_QUANTITY_NEPER_UNIT = UUID.fromString("00002786-0000-1000-8000-00805f9b34fb");

    /**
     * logarithmic radio quantity (bel) (Unit UUID: 0x2787)
     */
    public static final UUID LOGARITHMIC_RADIO_QUANTITY_BEL_UNIT = UUID.fromString("00002787-0000-1000-8000-00805f9b34fb");

    /**
     * length (yard) (Unit UUID: 0x27a0)
     */
    public static final UUID LENGTH_YARD_UNIT = UUID.fromString("000027a0-0000-1000-8000-00805f9b34fb");

    /**
     * length (parsec) (Unit UUID: 0x27a1)
     */
    public static final UUID LENGTH_PARSEC_UNIT = UUID.fromString("000027a1-0000-1000-8000-00805f9b34fb");

    /**
     * length (inch) (Unit UUID: 0x27a2)
     */
    public static final UUID LENGTH_INCH_UNIT = UUID.fromString("000027a2-0000-1000-8000-00805f9b34fb");

    /**
     * length (foot) (Unit UUID: 0x27a3)
     */
    public static final UUID LENGTH_FOOT_UNIT = UUID.fromString("000027a3-0000-1000-8000-00805f9b34fb");

    /**
     * length (mile) (Unit UUID: 0x27a4)
     */
    public static final UUID LENGTH_MILE_UNIT = UUID.fromString("000027a4-0000-1000-8000-00805f9b34fb");

    /**
     * pressure (pound-force per square inch) (Unit UUID: 0x27a5)
     */
    public static final UUID PRESSURE_POUND_FORCE_PER_SQUARE_INCH_UNIT = UUID.fromString("000027a5-0000-1000-8000-00805f9b34fb");

    /**
     * velocity (kilometre per hour) (Unit UUID: 0x27a6)
     */
    public static final UUID VELOCITY_KILOMETRE_PER_HOUR_UNIT = UUID.fromString("000027a6-0000-1000-8000-00805f9b34fb");

    /**
     * velocity (mile per hour) (Unit UUID: 0x27a7)
     */
    public static final UUID VELOCITY_MILE_PER_HOUR_UNIT = UUID.fromString("000027a7-0000-1000-8000-00805f9b34fb");

    /**
     * angular velocity (revolution per minute) (Unit UUID: 0x27a8)
     */
    public static final UUID ANGULAR_VELOCITY_REVOLUTION_PER_MINUTE_UNIT = UUID.fromString("000027a8-0000-1000-8000-00805f9b34fb");

    /**
     * energy (gram calorie) (Unit UUID: 0x27a9)
     */
    public static final UUID ENERGY_GRAM_CALORIE_UNIT = UUID.fromString("000027a9-0000-1000-8000-00805f9b34fb");

    /**
     * energy (kilogram calorie) (Unit UUID: 0x27aa)
     */
    public static final UUID ENERGY_KILOGRAM_CALORIE_UNIT = UUID.fromString("000027aa-0000-1000-8000-00805f9b34fb");

    /**
     * energy (kilowatt hour) (Unit UUID: 0x27ab)
     */
    public static final UUID ENERGY_KILOWATT_HOUR_UNIT = UUID.fromString("000027ab-0000-1000-8000-00805f9b34fb");

    /**
     * thermodynamic temperature (degree Fahrenheit) (Unit UUID: 0x27ac)
     */
    public static final UUID THERMODYNAMIC_TEMPERATURE_DEGREE_FAHRENHEIT_UNIT = UUID.fromString("000027ac-0000-1000-8000-00805f9b34fb");

    /**
     * percentage (Unit UUID: 0x27ad)
     */
    public static final UUID PERCENTAGE_UNIT = UUID.fromString("000027ad-0000-1000-8000-00805f9b34fb");

    /**
     * per mille (Unit UUID: 0x27ae)
     */
    public static final UUID PER_MILLE_UNIT = UUID.fromString("000027ae-0000-1000-8000-00805f9b34fb");

    /**
     * period (beats per minute) (Unit UUID: 0x27af)
     */
    public static final UUID PERIOD_BEATS_PER_MINUTE_UNIT = UUID.fromString("000027af-0000-1000-8000-00805f9b34fb");

    /**
     * electric charge (ampere hours) (Unit UUID: 0x27b0)
     */
    public static final UUID ELECTRIC_CHARGE_AMPERE_HOURS_UNIT = UUID.fromString("000027b0-0000-1000-8000-00805f9b34fb");

    /**
     * mass density (milligram per decilitre) (Unit UUID: 0x27b1)
     */
    public static final UUID MASS_DENSITY_MILLIGRAM_PER_DECILITRE_UNIT = UUID.fromString("000027b1-0000-1000-8000-00805f9b34fb");

    /**
     * mass density (millimole per litre) (Unit UUID: 0x27b2)
     */
    public static final UUID MASS_DENSITY_MILLIMOLE_PER_LITRE_UNIT = UUID.fromString("000027b2-0000-1000-8000-00805f9b34fb");

    /**
     * time (year) (Unit UUID: 0x27b3)
     */
    public static final UUID TIME_YEAR_UNIT = UUID.fromString("000027b3-0000-1000-8000-00805f9b34fb");

    /**
     * time (month) (Unit UUID: 0x27b4)
     */
    public static final UUID TIME_MONTH_UNIT = UUID.fromString("000027b4-0000-1000-8000-00805f9b34fb");

    /**
     * concentration (count per cubic metre) (Unit UUID: 0x27b5)
     */
    public static final UUID CONCENTRATION_COUNT_PER_CUBIC_METRE_UNIT = UUID.fromString("000027b5-0000-1000-8000-00805f9b34fb");

    /**
     * irradiance (watt per square metre) (Unit UUID: 0x27b6)
     */
    public static final UUID IRRADIANCE_WATT_PER_SQUARE_METRE_UNIT = UUID.fromString("000027b6-0000-1000-8000-00805f9b34fb");

    /**
     * milliliter (per kilogram per minute) (Unit UUID: 0x27b7)
     */
    public static final UUID TRANSFER_RATE_MILLILITER_PER_KILOGRAM_PER_MINUTE_UNIT = UUID.fromString("000027b7-0000-1000-8000-00805f9b34fb");

    /**
     * mass (pound) (Unit UUID: 0x27b8)
     */
    public static final UUID MASS_POUND_UNIT = UUID.fromString("000027b8-0000-1000-8000-00805f9b34fb");

    /**
     * metabolic equivalent (Unit UUID: 0x27b9)
     */
    public static final UUID METABOLIC_EQUIVALENT_UNIT = UUID.fromString("000027b9-0000-1000-8000-00805f9b34fb");

    /**
     * step (per minute) (Unit UUID: 0x27ba)
     */
    public static final UUID STEP_PER_MINUTE_UNIT = UUID.fromString("000027ba-0000-1000-8000-00805f9b34fb");

    /**
     * stroke (per minute) (Unit UUID: 0x27bc)
     */
    public static final UUID STROKE_PER_MINUTE_UNIT = UUID.fromString("000027bc-0000-1000-8000-00805f9b34fb");

    /**
     * pace (kilometre per minute) (Unit UUID: 0x27bd)
     */
    public static final UUID VELOCITY_KILOMETER_PER_MINUTE_UNIT = UUID.fromString("000027bd-0000-1000-8000-00805f9b34fb");

    /**
     * luminous efficacy (lumen per watt) (Unit UUID: 0x27be)
     */
    public static final UUID LUMINOUS_EFFICACY_LUMEN_PER_WATT_UNIT = UUID.fromString("000027be-0000-1000-8000-00805f9b34fb");

    /**
     * luminous energy (lumen hour) (Unit UUID: 0x27bf)
     */
    public static final UUID LUMINOUS_ENERGY_LUMEN_HOUR_UNIT = UUID.fromString("000027bf-0000-1000-8000-00805f9b34fb");

    /**
     * luminous exposure (lux hour) (Unit UUID: 0x27c0)
     */
    public static final UUID LUMINOUS_EXPOSURE_LUX_HOUR_UNIT = UUID.fromString("000027c0-0000-1000-8000-00805f9b34fb");

    /**
     * mass flow (gram per second) (Unit UUID: 0x27c1)
     */
    public static final UUID MASS_FLOW_GRAM_PER_SECOND_UNIT = UUID.fromString("000027c1-0000-1000-8000-00805f9b34fb");

    /**
     * volume flow (litre per second) (Unit UUID: 0x27c2)
     */
    public static final UUID VOLUME_FLOW_LITRE_PER_SECOND_UNIT = UUID.fromString("000027c2-0000-1000-8000-00805f9b34fb");

    /**
     * sound pressure (decibel) (Unit UUID: 0x27c3)
     */
    public static final UUID SOUND_PRESSURE_DECIBEL_SPL_UNIT = UUID.fromString("000027c3-0000-1000-8000-00805f9b34fb");

    /**
     * concentration (parts per million) (Unit UUID: 0x27c4)
     */
    public static final UUID CONCENTRATION_PARTS_PER_MILLION_UNIT = UUID.fromString("000027c4-0000-1000-8000-00805f9b34fb");

    /**
     * concentration (parts per billion) (Unit UUID: 0x27c5)
     */
    public static final UUID CONCENTRATION_PARTS_PER_BILLION_UNIT = UUID.fromString("000027c5-0000-1000-8000-00805f9b34fb");

}