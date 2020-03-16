stk.v.11.0
WrittenBy    STK_v11.6.1
BEGIN Scenario
    Name		 EOSystem

    BEGIN Epoch

        Epoch		 16 Mar 2020 03:00:00.000000000
        SmartEpoch		
        BEGIN EVENT
            Epoch		 16 Mar 2020 03:00:00.000000000
            EventEpoch		
            BEGIN EVENT
                Type		 EVENT_LINKTO
                Name		 AnalysisStartTime
            END EVENT
            EpochState		 Implicit
        END EVENT


    END Epoch

    BEGIN Interval

        Start		 16 Mar 2020 03:00:00.000000000
        Stop		 17 Mar 2020 03:00:00.000000000
        SmartInterval		
        BEGIN EVENTINTERVAL
            BEGIN Interval
                Start		 16 Mar 2020 03:00:00.000000000
                Stop		 17 Mar 2020 03:00:00.000000000
            END Interval
            IntervalState		 Explicit
        END EVENTINTERVAL

        EpochUsesAnalStart		 No
        AnimStartUsesAnalStart		 Yes
        AnimStopUsesAnalStop		 Yes

    END Interval

    BEGIN EOPFile

        InheritEOPSource		 No
        EOPFilename		 EOP-v1.1.txt

    END EOPFile

    BEGIN GlobalPrefs
        SatelliteNoOrbWarning		 No
        MissilePerigeeWarning		 No
        MissileStopTimeWarning		 No
        AircraftWGS84Warning		 Always
    END GlobalPrefs

    BEGIN CentralBody

        PrimaryBody		 Earth

    END CentralBody

    BEGIN CentralBodyTerrain

        BEGIN CentralBody
            Name		 Earth
            UseTerrainCache		 Yes
            TotalCacheSize		 402653184

            BEGIN StreamingTerrain
                UseCurrentStreamingTerrainServer		 Yes
                CurrentStreamingTerrainServerName		 http://twsusecovacc01.agi.com/stk-terrain
                StreamingTerrainTilesetName		 world
                StreamingTerrainServerName		 assets.agi.com/stk-terrain/
                StreamingTerrainAzimuthElevationMaskEnabled		 No
                StreamingTerrainObscurationEnabled		 No
                StreamingTerrainCoverageGridObscurationEnabled		 No
            END StreamingTerrain
        END CentralBody

    END CentralBodyTerrain

    BEGIN StarCollection

        Name		 Hipparcos 2 Mag 6

    END StarCollection

    BEGIN ScenarioLicenses
        Module		 STKv11.6
    END ScenarioLicenses

    BEGIN Extensions

        BEGIN ClsApp
            RangeConstraint		 5000
            ApoPeriPad		 30000
            OrbitPathPad		 100000
            TimeDistPad		 30000
            OutOfDate		 2.592e+06
            MaxApoPeriStep		 900
            ApoPeriAngle		 0.785398
            UseApogeePerigeeFilter		 Yes
            UsePathFilter		 No
            UseTimeFilter		 No
            UseOutOfDate		 Yes
            CreateSats		 No
            MaxSatsToCreate		 500
            UseModelScale		 No
            ModelScale		 0
            UseCrossRefDb		 Yes
            CollisionDB		 stkAllTLE.tce
            CollisionCrossRefDB		 stkAllTLE.sd
            ShowLine		 Yes
            AnimHighlight		 Yes
            StaticHighlight		 Yes
            UseLaunchWindow		 No
            LaunchWindowUseEntireTraj		 Yes
            LaunchWindowTrajMETStart		 0
            LaunchWindowTrajMETStop		 900
            LaunchWindowStart		 0
            LaunchWindowStop		 0
            LaunchMETOffset		 0
            LaunchWindowUseSecEphem		 No 
            LaunchWindowUseScenFolderForSecEphem		 Yes
            LaunchWindowUsePrimEphem		 No 
            LaunchWindowUseScenFolderForPrimEphem		 Yes
            LaunchWindowIntervalPtr		
            BEGIN EVENTINTERVAL
                BEGIN Interval
                    Start		 16 Mar 2020 03:00:00.000000000
                    Stop		 17 Mar 2020 03:00:00.000000000
                END Interval
                IntervalState		 Explicit
            END EVENTINTERVAL

            LaunchWindowUsePrimMTO		 No 
            GroupLaunches		 No 
            LWTimeConvergence		 0.001
            LWRelValueConvergence		 1e-08
            LWTSRTimeConvergence		 0.0001
            LWTSRRelValueConvergence		 1e-10
            LaunchWindowStep		 300
            MaxTSRStep		  1.8000000000000000e+02
            MaxTSRRelMotion		  2.0000000000000000e+01
            UseLaunchArea		 No 
            LaunchAreaOrientation		 North
            LaunchAreaAzimuth		 0
            LaunchAreaXLimits		 -10000 10000
            LaunchAreaYLimits		 -10000 10000
            LaunchAreaNumXIntrPnts		 1
            LaunchAreaNumYIntrPnts		 1
            LaunchAreaAltReference		 Ellipsoid
            TargetSameStop		 No 
            SkipSurfaceMetric		 No 
            LWAreaTSRRelValueConvergence		 1e-10
            AreaLaunchWindowStep		 300
            AreaMaxTSRStep		  3.0000000000000000e+01
            AreaMaxTSRRelMotion		 1
            ShowLaunchArea		 No 
            ShowBlackoutTracks		 No 
            ShowClearedTracks		 No 
            UseObjectForClearedColor		 No 
            BlackoutColor		 #ff0000
            ClearedColor		 #ffffff
            ShowTracksSegments		 Yes
            ShowMinRangeTracks		 Yes
            MinRangeTrackTimeStep		 0.5
            UsePrimStepForTracks		 Yes
            GfxTracksTimeStep		 30
            GfxAreaNumXIntrPnts		 1
            GfxAreaNumYIntrPnts		 1
            CreateLaunchMTO		 No 
            CovarianceSigmaScale		 3
            CovarianceMode		 None 
        END ClsApp

        BEGIN Units
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            SolidAngle		 Steradians
            SpectralBandwidthUnit		 Hertz
            BitsUnit		 MegaBits
            MagneticFieldUnit		 nanoTesla
        END Units

        BEGIN ReportUnits
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            SolidAngle		 Steradians
            SpectralBandwidthUnit		 Hertz
            BitsUnit		 MegaBits
            MagneticFieldUnit		 nanoTesla
        END ReportUnits

        BEGIN ConnectReportUnits
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            SolidAngle		 Steradians
            SpectralBandwidthUnit		 Hertz
            BitsUnit		 MegaBits
            MagneticFieldUnit		 nanoTesla
        END ConnectReportUnits

        BEGIN ReportFavorites
        END ReportFavorites

        BEGIN ADFFileData
        END ADFFileData

        BEGIN GenDb

            BEGIN Database
                DbType		 Satellite
                DefDb		 stkAllTLE.sd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "SSC Number"
                        Default		 "*"
                    END Field

                    BEGIN Field
                        Name		 "Common Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 City
                DefDb		 stkCityDb.cd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "City Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 Facility
                DefDb		 stkFacility.fd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                END FieldDefaults

            END Database
        END GenDb

        BEGIN SOCDb
            BEGIN Defaults
                BEGIN Catalog Cities
                    BEGIN Criteria Name
                        Type		 Value
                        Value		 tokyo
                    END Criteria
                END Catalog
            END Defaults
        END SOCDb

        BEGIN Msgp4Ext
        END Msgp4Ext

        BEGIN FileLocations
        END FileLocations

        BEGIN Author
            Optimize		 No
            UseBasicGlobe		 No
            SaveEphemeris		 Yes
            SaveScenFolder		 No
            BEGIN ExternalFileTypes
                BEGIN Type
                    FileType		 Calculation Scalar
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Celestial Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Cloud
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 EOP
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 External Vector Data
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Globe
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Globe Data
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Marker/Label
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Model
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Object Break-up File
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Planetary Ephemeris
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Report Style Script
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Report/Graph Style
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Scalar Calculation File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Terrain
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Volume Grid Intervals File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Volumetric File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 WTM
                    Include		 Yes
                END Type
            END ExternalFileTypes
            ReadOnly		 No
            ViewerPassword		 No
            STKPassword		 No
            ExcludeInstallFiles		 No
            BEGIN ExternalFileList
            END ExternalFileList
        END Author

        BEGIN ExportDataFile
            FileType		 Ephemeris
            IntervalType		 Ephemeris
            TimePeriodStart		 0
            TimePeriodStop		 0
            StepType		 Ephemeris
            StepSize		 60
            EphemType		 STK
            UseVehicleCentralBody		 Yes
            CentralBody		 Earth
            SatelliteID		 -200000
            CoordSys		 ICRF
            NonSatCoordSys		 Fixed
            InterpolateBoundaries		 Yes
            EphemFormat		 Current
            InterpType		 9
            InterpOrder		 5
            AttCoordSys		 Fixed
            Quaternions		 0
            ExportCovar		 Position
            AttitudeFormat		 Current
            TimePrecision		 6
            CCSDSDateFormat		 YMD
            CCSDSEphFormat		 SciNotation
            CCSDSTimeSystem		 UTC
            CCSDSRefFrame		 ICRF
            UseSatCenterAndFrame		 No
            IncludeCovariance		 No
            IncludeAcceleration		 No
            CCSDSFileFormat		 KVN
        END ExportDataFile

        BEGIN Desc
        END Desc

        BEGIN RfEnv
<?xml version = "1.0" standalone = "yes"?>
<VAR name = "STK_RF_Environment">
    <SCOPE Class = "RFEnvironment">
        <VAR name = "Version">
            <STRING>&quot;1.0.0 a&quot;</STRING>
        </VAR>
        <VAR name = "STKVersion">
            <INT>1161</INT>
        </VAR>
        <VAR name = "ComponentName">
            <STRING>&quot;STK_RF_Environment&quot;</STRING>
        </VAR>
        <VAR name = "Description">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "Type">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "UserComment">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "ReadOnly">
            <BOOL>false</BOOL>
        </VAR>
        <VAR name = "Clonable">
            <BOOL>true</BOOL>
        </VAR>
        <VAR name = "Category">
            <STRING>&quot;&quot;</STRING>
        </VAR>
        <VAR name = "PropagationChannel">
            <VAR name = "RF_Propagation_Channel">
                <SCOPE Class = "PropagationChannel">
                    <VAR name = "Version">
                        <STRING>&quot;1.0.0 a&quot;</STRING>
                    </VAR>
                    <VAR name = "STKVersion">
                        <INT>1161</INT>
                    </VAR>
                    <VAR name = "ComponentName">
                        <STRING>&quot;RF_Propagation_Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "Description">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "Type">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "UserComment">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "ReadOnly">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "Clonable">
                        <BOOL>true</BOOL>
                    </VAR>
                    <VAR name = "Category">
                        <STRING>&quot;&quot;</STRING>
                    </VAR>
                    <VAR name = "UseITU618Section2p5">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCloudFogModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "CloudFogModel">
                        <VAR name = "ITU-R_P840-6">
                            <SCOPE Class = "CloudFogLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1161</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P840-6&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "LiquidWaterDensityValueChoice">
                                    <STRING>&quot;Liquid Water Content Density Value&quot;</STRING>
                                </VAR>
                                <VAR name = "CloudCeiling">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>3000</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLayerThickness">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>500</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudTemp">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLiqWaterDensity">
                                    <QUANTITY Dimension = "SmallDensity" Unit = "kg*m^-3">
                                        <REAL>0.0075</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "AnnualAveragePercentValue">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.01</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "MonthlyAveragePercentValue">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.01</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "LiqWaterAverageDataMonth">
                                    <INT>1</INT>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseTropoScintModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "TropoScintModel">
                        <VAR name = "ITU-R_P618-12">
                            <SCOPE Class = "TropoScintLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1161</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "FadeDepthAverageTimeChoice">
                                    <STRING>&quot;Fade depth for the average year&quot;</STRING>
                                </VAR>
                                <VAR name = "ComputeDeepFade">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "FadeOutage">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.001</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "PercentTimeRefracGrad">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.1</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseIonoFadingModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "IonoFadingModel">
                        <VAR name = "ITU-R_P531-13">
                            <SCOPE Class = "IonoFadingLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1161</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "UseAlternateAPFile">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "AlternateAPDataFile">
                                    <STRING>
                                        <PROP name = "FullName">
                                            <STRING>&quot;&quot;</STRING>
                                        </PROP>&quot;&quot;</STRING>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseRainModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "RainModel">
                        <VAR name = "ITU-R_P618-12">
                            <SCOPE Class = "RainLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1161</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-12 rain model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-12 rain model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "EnableDepolarizationLoss">
                                    <BOOL>false</BOOL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseAtmosAbsorptionModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "AtmosAbsorptionModel">
                        <VAR name = "ITU-R_P676-9">
                            <SCOPE Class = "AtmosphericAbsorptionModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.1 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1161</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P676-9&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P676-9 gaseous absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P676-9&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P676-9 gaseous absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "UseApproxMethod">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "UseSeasonalRegional">
                                    <BOOL>true</BOOL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseUrbanTerresPropLossModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UrbanTerresPropLossModel">
                        <VAR name = "Two_Ray">
                            <SCOPE Class = "UrbanTerrestrialPropagationLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1161</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Two_Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Two Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "LossFactor">
                                    <REAL>1</REAL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseCustomA">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCustomB">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCustomC">
                        <BOOL>false</BOOL>
                    </VAR>
                </SCOPE>
            </VAR>
        </VAR>
        <VAR name = "EarthTemperature">
            <QUANTITY Dimension = "Temperature" Unit = "K">
                <REAL>290</REAL>
            </QUANTITY>
        </VAR>
        <VAR name = "RainOutagePercent">
            <PROP name = "FormatString">
                <STRING>&quot;%#6.3f&quot;</STRING>
            </PROP>
            <REAL>0.1</REAL>
        </VAR>
        <VAR name = "ActiveCommSystem">
            <LINKTOOBJ>
                <STRING>&quot;None&quot;</STRING>
            </LINKTOOBJ>
        </VAR>
    </SCOPE>
</VAR>        END RfEnv

        BEGIN CommRad
        END CommRad

        BEGIN Crdn
        END Crdn

        BEGIN SpiceExt
        END SpiceExt

        BEGIN Graphics

            BEGIN Animation

                StartTime		 16 Mar 2020 03:00:00.000000000
                EndTime		 17 Mar 2020 03:00:00.000000000
                CurrentTime		 16 Mar 2020 03:00:00.000000000
                Direction		 Forward
                UpdateDelta		 10
                RefreshDelta		 0.010000
                XRealTimeMult		 1
                RealTimeOffset		 0
                XRtStartFromPause		                Yes		

            END Animation


            BEGIN DisplayFlags
                ShowLabels		 On
                ShowPassLabel		 Off
                ShowElsetNum		 Off
                ShowGndTracks		 On
                ShowGndMarkers		 On
                ShowOrbitMarkers		 On
                ShowPlanetOrbits		 Off
                ShowPlanetCBIPos		 On
                ShowPlanetCBILabel		 On
                ShowPlanetGndPos		 On
                ShowPlanetGndLabel		 On
                ShowSensors		 On
                ShowWayptMarkers		 Off
                ShowWayptTurnMarkers		 Off
                ShowOrbits		 On
                ShowDtedRegions		 Off
                ShowAreaTgtCentroids		 On
                ShowToolBar		 On
                ShowStatusBar		 On
                ShowScrollBars		 On
                AllowAnimUpdate		 On
                AccShowLine		 On
                AccAnimHigh		 On
                AccStatHigh		 On
                ShowPrintButton		 On
                ShowAnimButtons		 On
                ShowAnimModeButtons		 On
                ShowZoomMsrButtons		 On
                ShowMapCbButton		 Off
            END DisplayFlags

            BEGIN WinFonts

                System
                MS Sans Serif,22,0,0
                MS Sans Serif,28,0,0

            END WinFonts

            BEGIN MapData

                BEGIN TerrainConverterData
                    NorthLat		  0.0000000000000000e+00
                    EastLon		  0.0000000000000000e+00
                    SouthLat		  0.0000000000000000e+00
                    WestLon		  0.0000000000000000e+00
                    ColorByRGB		 No
                    AltsFromMSL		 No
                    UseColorRamp		 Yes
                    UseRegionMinMax		 Yes
                    SizeSameAsSrc		 Yes
                    MinAltHSV		  0.0000000000000000e+00  6.9999999999999996e-01  8.0000000000000004e-01  4.0000000000000002e-01
                    MaxAltHSV		  1.0000000000000000e+06  0.0000000000000000e+00  2.0000000000000001e-01  1.0000000000000000e+00
                    SmoothColors		 Yes
                    CreateChunkTrn		 No
                    OutputFormat		 PDTTX
                END TerrainConverterData

                DisableDefKbdActions		 Off
                TextShadowStyle		 Dark
                TextShadowColor		 #000000
                BingLevelOfDetailScale		 2
                BEGIN Map
                    MapNum		 1
                    TrackingMode		 LatLon
                    PickEnabled		 On
                    PanEnabled		 On

                    BEGIN MapAttributes
                        PrimaryBody		 Earth
                        SecondaryBody		 Sun
                        CenterLatitude		 0
                        CenterLongitude		 0
                        ProjectionAltitude		 63621860
                        FieldOfView		 35
                        OrthoDisplayDistance		 20000000
                        TransformTrajectory		 On
                        EquatorialRadius		 6378137
                        BackgroundColor		 #000000
                        LatLonLines		 On
                        LatSpacing		 30
                        LonSpacing		 30
                        LatLonLineColor		 #999999
                        LatLonLineStyle		 2
                        ShowOrthoDistGrid		 Off
                        OrthoGridXSpacing		 5
                        OrthoGridYSpacing		 5
                        OrthoGridColor		 #ffffff
                        ShowImageExtents		 Off
                        ImageExtentLineColor		 #ffffff
                        ImageExtentLineStyle		 0
                        ImageExtentLineWidth		 1
                        ShowImageNames		 Off
                        ImageNameFont		 0
                        Projection		 EquidistantCylindrical
                        Resolution		 VeryLow
                        CoordinateSys		 ECF
                        UseBackgroundImage		 On
                        UseBingForBackground		 On
                        BingType		 Aerial
                        BingLogoHorizAlign		 Right
                        BingLogoVertAlign		 Bottom
                        BackgroundImageFile		 Basic.bmp
                        UseNightLights		 Off
                        NightLightsFactor		 3.5
                        UseCloudsFile		 Off
                        BEGIN ZoomLocations
                            BEGIN ZoomLocation
                                CenterLat		 0
                                CenterLon		 0
                                ZoomWidth		 359.999998
                                ZoomHeight		 180
                            END ZoomLocation
                        END ZoomLocations
                        UseVarAspectRatio		 No
                        SwapMapResolution		 Yes
                        NoneToVLowSwapDist		 2000000
                        VLowToLowSwapDist		 20000
                        LowToMediumSwapDist		 10000
                        MediumToHighSwapDist		 5000
                        HighToVHighSwapDist		 1000
                        VHighToSHighSwapDist		 100
                        BEGIN Axes
                            DisplayAxes		 no
                            CoordSys		 CBI
                            2aryCB		 Sun
                            Display+x		 yes
                            Label+x		 yes
                            Color+x		 #ffffff
                            Scale+x		 3
                            Display-x		 yes
                            Label-x		 yes
                            Color-x		 #ffffff
                            Scale-x		 3
                            Display+y		 yes
                            Label+y		 yes
                            Color+y		 #ffffff
                            Scale+y		 3
                            Display-y		 yes
                            Label-y		 yes
                            Color-y		 #ffffff
                            Scale-y		 3
                            Display+z		 yes
                            Label+z		 yes
                            Color+z		 #ffffff
                            Scale+z		 3
                            Display-z		 yes
                            Label-z		 yes
                            Color-z		 #ffffff
                            Scale-z		 3
                        END Axes

                    END MapAttributes

                    BEGIN MapList
                        BEGIN Detail
                            Alias		 RWDB2_Coastlines
                            Show		 Yes
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_International_Borders
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Islands
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Lakes
                            Show		 No
                            Color		 #87cefa
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Provincial_Borders
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Rivers
                            Show		 No
                            Color		 #87cefa
                        END Detail
                    END MapList


                    BEGIN MapAnnotations
                    END MapAnnotations

                    BEGIN DisplayFlags
                        ShowLabels		 On
                        ShowPassLabel		 Off
                        ShowElsetNum		 Off
                        ShowGndTracks		 On
                        ShowGndMarkers		 On
                        ShowOrbitMarkers		 On
                        ShowPlanetOrbits		 Off
                        ShowPlanetCBIPos		 On
                        ShowPlanetCBILabel		 On
                        ShowPlanetGndPos		 On
                        ShowPlanetGndLabel		 On
                        ShowSensors		 On
                        ShowWayptMarkers		 Off
                        ShowWayptTurnMarkers		 Off
                        ShowOrbits		 On
                        ShowDtedRegions		 Off
                        ShowAreaTgtCentroids		 On
                        ShowToolBar		 On
                        ShowStatusBar		 On
                        ShowScrollBars		 On
                        AllowAnimUpdate		 Off
                        AccShowLine		 On
                        AccAnimHigh		 On
                        AccStatHigh		 On
                        ShowPrintButton		 On
                        ShowAnimButtons		 On
                        ShowAnimModeButtons		 On
                        ShowZoomMsrButtons		 On
                        ShowMapCbButton		 Off
                    END DisplayFlags

                    BEGIN RecordMovie
                        OutputFormat		 WMV
                        BaseName		 Frame
                        Digits		 4
                        Frame		 0
                        LastAnimTime		 0
                        OutputMode		 Normal
                        HiResAssembly		 Assemble
                        HRWidth		 6000
                        HRHeight		 4500
                        HRDPI		 600
                        UseSnapInterval		 No
                        SnapInterval		 0
                        WmvCodec		 "Windows Media Video 9"
                        Framerate		 30
                        Bitrate		 3000000
                    END RecordMovie


                    BEGIN TimeDisplay
                        Show		 0
                        TextColor		 #ffffff
                        TextTranslucency		 0
                        ShowBackground		 0
                        BackColor		 #4d4d4d
                        BackTranslucency		 0.4
                        XPosition		 20
                        YPosition		 -20
                    END TimeDisplay

                    BEGIN LightingData
                        DisplayAltitude		 0
                        SubsolarPoint		 Off
                        SubsolarPointColor		 #ffff00
                        SubsolarPointMarkerStyle		 2

                        ShowUmbraLine		 Off
                        UmbraLineColor		 #000000
                        UmbraLineStyle		 0
                        UmbraLineWidth		 2
                        FillUmbra		 On
                        UmbraFillColor		 #000000
                        ShowSunlightLine		 Off
                        SunlightLineColor		 #ffff00
                        SunlightLineStyle		 0
                        SunlightLineWidth		 2
                        FillSunlight		 On
                        SunlightFillColor		 #ffffff
                        SunlightMinOpacity		 0
                        SunlightMaxOpacity		 0.2
                        UmbraMaxOpacity		 0.7
                        UmbraMinOpacity		 0.4
                    END LightingData
                END Map

                BEGIN MapStyles

                    UseStyleTime		 No

                    BEGIN Style
                        Name		 DefaultWithBing
                        Time		 0
                        UpdateDelta		 10

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 On
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN RecordMovie
                            OutputFormat		 WMV
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            WmvCodec		 "Windows Media Video 9"
                            Framerate		 30
                            Bitrate		 3000000
                        END RecordMovie


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                    BEGIN Style
                        Name		 DefaultWithoutBing
                        Time		 0
                        UpdateDelta		 10

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 Off
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN RecordMovie
                            OutputFormat		 WMV
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            WmvCodec		 "Windows Media Video 9"
                            Framerate		 30
                            Bitrate		 3000000
                        END RecordMovie


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                END MapStyles

            END MapData

            BEGIN GfxClassPref

            END GfxClassPref


            BEGIN ConnectGraphicsOptions

                AsyncPickReturnUnique		 OFF

            END ConnectGraphicsOptions

        END Graphics

        BEGIN Overlays
        END Overlays

        BEGIN VO
        END VO

    END Extensions

    BEGIN SubObjects

        Class Place

            Abidjan		
            Accra		
            Adana		
            Addis_Ababa		
            Agra		
            Ahmedabad		
            Ahvaz		
            Albany		
            Albuquerque		
            Aleppo		
            Alexandria		
            Algiers		
            Almaty		
            Amman		
            Amritsar		
            Ankara		
            Anshan		
            Antalya		
            Antananarivo		
            Atlanta		
            Auckland		
            Aurangabad		
            Baghdad		
            Bamako		
            Bandar_Lampung		
            Bandung		
            Bangkok		
            Baotou		
            Barcelona		
            Barranquilla		
            Basrah		
            Bazhong		
            Beijing		
            Belem		
            Belgrade		
            Belo_Horizonte		
            Bengaluru		
            Berlin		
            Berlin_Adlershof		
            Bhopal		
            Bijie		
            Birmingham		
            Bogor		
            Bogota		
            Boston		
            Bozhou		
            Brasilia		
            Brisbane		
            Bucharest		
            Budapest		
            Buenos_Aires		
            Buffalo		
            Bursa		
            Busan		
            Cairo		
            Calgary		
            Cali		
            Caloocan		
            Campinas		
            Caracas		
            Cartagena		
            Casablanca		
            Changchun		
            Changde		
            Changsha		
            Changzhou		
            Charlotte		
            Chelyabinsk		
            Chengdu		
            Chennai		
            Chicago		
            Chittagong		
            Cincinnati		
            Ciudad_Juarez		
            Ciudad_Nezahualcoyotl		
            Cleveland		
            Coimbatore		
            Cologne		
            Columbus		
            Conakry		
            Cordoba		
            Curitiba		
            Daegu		
            Daejeon		
            Dakar		
            Dalian		
            Dallas		
            Damascus		
            Dar_Es_Salaam		
            Datong		
            Davao		
            Dayton		
            Delhi		
            Denver		
            Detroit		
            Dhaka		
            Dhanbad		
            Douala		
            Dubai		
            East_Grand_Rapids		
            East_Las_Vegas		
            El_Paso		
            Ezhou		
            Faisalabad		
            Faridabad		
            Fes		
            Fresno		
            Fukuoka		
            Fushun		
            Fuzhou		
            Gaziantep		
            Ghaziabad		
            Giza		
            Glasgow		
            Goiania		
            Greensboro		
            Greenville		
            Guadalajara		
            Guanghan		
            Guangzhou		
            Guarulhos		
            Guatemala		
            Guayaquil		
            Guigang		
            Guiyang		
            Gujranwala		
            Gwalior		
            Gwangju		
            Hamburg		
            Handan		
            Hangzhou		
            Hanoi		
            Harare		
            Harbin		
            Harrisburg		
            Havana		
            Hefei		
            Hertford		
            Heze		
            Hiroshima		
            Ho_Chi_Minh_City		
            Hohhot		
            Houston		
            Huainan		
            Huaiyin		
            Huzhou		
            Hyderabad		
            Ibadan		
            Inashiki		
            Indianapolis		
            Indore		
            Isfahan		
            Istanbul		
            Izmir		
            Jabalpur		
            Jacksonville		
            Jaipur		
            Jakarta		
            Jeddah		
            Jilin		
            Jinan		
            Jingzhou		
            Jining		
            Jodhpur		
            Kabul		
            Kalyan		
            Kampala		
            Kano		
            Kanpur		
            Kansas_City		
            Karachi		
            Kathmandu		
            Kawasaki		
            Kawasaki_Si		
            Kazan		
            Kharkiv		
            Kinshasa		
            Knoxville		
            Kobe		
            Kolkata		
            Konya		
            Kota		
            Krasnoyarsk		
            Kuala_Lumpur		
            Kumasi		
            Kunming		
            Kyoto		
            Lahore		
            Laiwu		
            Lanzhou		
            Leon		
            Leshan		
            Lima		
            Linyi		
            Liuzhou		
            London		
            Los_Angeles		
            Louisville		
            Luanda		
            Lucknow		
            Ludhiana		
            Luoyang		
            Lusaka		
            Luzhou		
            Maceio		
            Madrid		
            Madurai		
            Makassar		
            Manaus		
            Mandalay		
            Manila		
            Maputo		
            Maracaibo		
            Mashhad		
            Mecca		
            Medan		
            Medellin		
            Medina		
            Meerut		
            Melbourne		
            Memphis		
            Mendoza		
            Mexico		
            Miami		
            Mianyang		
            Milano		
            Milwaukee		
            Minneapolis		
            Minsk		
            Mogadishu		
            Monterrey		
            Montevideo		
            Montreal		
            Moscow		
            Mosul		
            Mudanjiang		
            Multan		
            Mumbai		
            Munich		
            Nagoya		
            Nagpur		
            Nairobi		
            Nanchang		
            Nanchong		
            Nanjing		
            Nanning		
            Nashville		
            Neijiang		
            New_Orleans		
            New_York		
            Niamey		
            Ningbo		
            North_Virginia_Beach		
            Novosibirsk		
            Oklahoma_City		
            Omdurman		
            Omsk		
            Oran		
            Orlando		
            Osaka		
            Ouagadougou		
            Palembang		
            Paris		
            Patna		
            Pekanbaru		
            Perth		
            Philadelphia		
            Phnom_Penh		
            Phoenix		
            Pimpri		
            Pittsburgh		
            Port_Adelaide		
            Portland		
            Porto_Alegre		
            Prague		
            Puebla		
            Pune		
            Pyongyang		
            Qingdao		
            Qinzhou		
            Qiqihar		
            Qom		
            Quanzhou		
            Quezon		
            Quito		
            Raipur		
            Rajkot		
            Raleigh		
            Ranchi		
            Rawalpindi		
            Recife		
            Rio_De_Janeiro		
            Riyadh		
            Rizhao		
            Rochester		
            Rome		
            Rosario		
            Rostov_On_Don		
            Sacramento		
            Saint_Louis		
            Saint_Petersburg		
            Saitama		
            Salt_Lake_City		
            Salvador		
            Samara		
            San_Antonio		
            San_Diego		
            Sanaa		
            Santa_Cruz_De_La_Sierra		
            Santiago		
            Santo_Domingo		
            Sao_Goncalo		
            Sao_Luis		
            Sao_Paulo		
            Sapporo		
            Seattle		
            Semarang		
            Sendai		
            Seoul		
            Shanghai		
            Shangqiu		
            Shantou		
            Shenyang		
            Shenzhen		
            Shijiazhuang		
            Shiraz		
            Singapore		
            Sofia		
            South_San_Jose_Hills		
            Srinagar		
            Suining		
            Suizhou		
            Surabaya		
            Surat		
            Suzhou		
            Sydney		
            Tabriz		
            Taihe		
            Taipei		
            Taiyuan		
            Taizhou		
            Tangerang		
            Tangshan		
            Taoyuan		
            Tashkent		
            Tbilisi		
            Tegucigalpa		
            Tehran		
            Thane		
            Tianjin		
            Tianshui		
            Tijuana		
            Tokyo		
            Toronto		
            Tripoli		
            Tucson		
            Ufa		
            Ulaanbaatar		
            Ulsan		
            Urumqi		
            Varanasi		
            Vasai		
            Vienna		
            Vijayawada		
            Visakhapatnam		
            Volgograd		
            Warsaw		
            Weifang		
            Wenzhou		
            Wuhan		
            Wuxi		
            Xiamen		
            Xian		
            Xinyang		
            Xuzhou		
            Yangon		
            Yantai		
            Yaounde		
            Yekaterinburg		
            Yerevan		
            Yiyang		
            Yokohama		
            Zaozhuang		
            Zapopan		
            Zhanjiang		
            Zhengzhou		
            Zibo		
            Zigong		
            Ziyang		

        END Class

    END SubObjects

    BEGIN References
        Instance *
            *		
        END Instance
        Instance Place/Abidjan
            Place/Abidjan		
        END Instance
        Instance Place/Accra
            Place/Accra		
        END Instance
        Instance Place/Adana
            Place/Adana		
        END Instance
        Instance Place/Addis_Ababa
            Place/Addis_Ababa		
        END Instance
        Instance Place/Agra
            Place/Agra		
        END Instance
        Instance Place/Ahmedabad
            Place/Ahmedabad		
        END Instance
        Instance Place/Ahvaz
            Place/Ahvaz		
        END Instance
        Instance Place/Albany
            Place/Albany		
        END Instance
        Instance Place/Albuquerque
            Place/Albuquerque		
        END Instance
        Instance Place/Aleppo
            Place/Aleppo		
        END Instance
        Instance Place/Alexandria
            Place/Alexandria		
        END Instance
        Instance Place/Algiers
            Place/Algiers		
        END Instance
        Instance Place/Almaty
            Place/Almaty		
        END Instance
        Instance Place/Amman
            Place/Amman		
        END Instance
        Instance Place/Amritsar
            Place/Amritsar		
        END Instance
        Instance Place/Ankara
            Place/Ankara		
        END Instance
        Instance Place/Anshan
            Place/Anshan		
        END Instance
        Instance Place/Antalya
            Place/Antalya		
        END Instance
        Instance Place/Antananarivo
            Place/Antananarivo		
        END Instance
        Instance Place/Atlanta
            Place/Atlanta		
        END Instance
        Instance Place/Auckland
            Place/Auckland		
        END Instance
        Instance Place/Aurangabad
            Place/Aurangabad		
        END Instance
        Instance Place/Baghdad
            Place/Baghdad		
        END Instance
        Instance Place/Bamako
            Place/Bamako		
        END Instance
        Instance Place/Bandar_Lampung
            Place/Bandar_Lampung		
        END Instance
        Instance Place/Bandung
            Place/Bandung		
        END Instance
        Instance Place/Bangkok
            Place/Bangkok		
        END Instance
        Instance Place/Baotou
            Place/Baotou		
        END Instance
        Instance Place/Barcelona
            Place/Barcelona		
        END Instance
        Instance Place/Barranquilla
            Place/Barranquilla		
        END Instance
        Instance Place/Basrah
            Place/Basrah		
        END Instance
        Instance Place/Bazhong
            Place/Bazhong		
        END Instance
        Instance Place/Beijing
            Place/Beijing		
        END Instance
        Instance Place/Belem
            Place/Belem		
        END Instance
        Instance Place/Belgrade
            Place/Belgrade		
        END Instance
        Instance Place/Belo_Horizonte
            Place/Belo_Horizonte		
        END Instance
        Instance Place/Bengaluru
            Place/Bengaluru		
        END Instance
        Instance Place/Berlin
            Place/Berlin		
        END Instance
        Instance Place/Berlin_Adlershof
            Place/Berlin_Adlershof		
        END Instance
        Instance Place/Bhopal
            Place/Bhopal		
        END Instance
        Instance Place/Bijie
            Place/Bijie		
        END Instance
        Instance Place/Birmingham
            Place/Birmingham		
        END Instance
        Instance Place/Bogor
            Place/Bogor		
        END Instance
        Instance Place/Bogota
            Place/Bogota		
        END Instance
        Instance Place/Boston
            Place/Boston		
        END Instance
        Instance Place/Bozhou
            Place/Bozhou		
        END Instance
        Instance Place/Brasilia
            Place/Brasilia		
        END Instance
        Instance Place/Brisbane
            Place/Brisbane		
        END Instance
        Instance Place/Bucharest
            Place/Bucharest		
        END Instance
        Instance Place/Budapest
            Place/Budapest		
        END Instance
        Instance Place/Buenos_Aires
            Place/Buenos_Aires		
        END Instance
        Instance Place/Buffalo
            Place/Buffalo		
        END Instance
        Instance Place/Bursa
            Place/Bursa		
        END Instance
        Instance Place/Busan
            Place/Busan		
        END Instance
        Instance Place/Cairo
            Place/Cairo		
        END Instance
        Instance Place/Calgary
            Place/Calgary		
        END Instance
        Instance Place/Cali
            Place/Cali		
        END Instance
        Instance Place/Caloocan
            Place/Caloocan		
        END Instance
        Instance Place/Campinas
            Place/Campinas		
        END Instance
        Instance Place/Caracas
            Place/Caracas		
        END Instance
        Instance Place/Cartagena
            Place/Cartagena		
        END Instance
        Instance Place/Casablanca
            Place/Casablanca		
        END Instance
        Instance Place/Changchun
            Place/Changchun		
        END Instance
        Instance Place/Changde
            Place/Changde		
        END Instance
        Instance Place/Changsha
            Place/Changsha		
        END Instance
        Instance Place/Changzhou
            Place/Changzhou		
        END Instance
        Instance Place/Charlotte
            Place/Charlotte		
        END Instance
        Instance Place/Chelyabinsk
            Place/Chelyabinsk		
        END Instance
        Instance Place/Chengdu
            Place/Chengdu		
        END Instance
        Instance Place/Chennai
            Place/Chennai		
        END Instance
        Instance Place/Chicago
            Place/Chicago		
        END Instance
        Instance Place/Chittagong
            Place/Chittagong		
        END Instance
        Instance Place/Cincinnati
            Place/Cincinnati		
        END Instance
        Instance Place/Ciudad_Juarez
            Place/Ciudad_Juarez		
        END Instance
        Instance Place/Ciudad_Nezahualcoyotl
            Place/Ciudad_Nezahualcoyotl		
        END Instance
        Instance Place/Cleveland
            Place/Cleveland		
        END Instance
        Instance Place/Coimbatore
            Place/Coimbatore		
        END Instance
        Instance Place/Cologne
            Place/Cologne		
        END Instance
        Instance Place/Columbus
            Place/Columbus		
        END Instance
        Instance Place/Conakry
            Place/Conakry		
        END Instance
        Instance Place/Cordoba
            Place/Cordoba		
        END Instance
        Instance Place/Curitiba
            Place/Curitiba		
        END Instance
        Instance Place/Daegu
            Place/Daegu		
        END Instance
        Instance Place/Daejeon
            Place/Daejeon		
        END Instance
        Instance Place/Dakar
            Place/Dakar		
        END Instance
        Instance Place/Dalian
            Place/Dalian		
        END Instance
        Instance Place/Dallas
            Place/Dallas		
        END Instance
        Instance Place/Damascus
            Place/Damascus		
        END Instance
        Instance Place/Dar_Es_Salaam
            Place/Dar_Es_Salaam		
        END Instance
        Instance Place/Datong
            Place/Datong		
        END Instance
        Instance Place/Davao
            Place/Davao		
        END Instance
        Instance Place/Dayton
            Place/Dayton		
        END Instance
        Instance Place/Delhi
            Place/Delhi		
        END Instance
        Instance Place/Denver
            Place/Denver		
        END Instance
        Instance Place/Detroit
            Place/Detroit		
        END Instance
        Instance Place/Dhaka
            Place/Dhaka		
        END Instance
        Instance Place/Dhanbad
            Place/Dhanbad		
        END Instance
        Instance Place/Douala
            Place/Douala		
        END Instance
        Instance Place/Dubai
            Place/Dubai		
        END Instance
        Instance Place/East_Grand_Rapids
            Place/East_Grand_Rapids		
        END Instance
        Instance Place/East_Las_Vegas
            Place/East_Las_Vegas		
        END Instance
        Instance Place/El_Paso
            Place/El_Paso		
        END Instance
        Instance Place/Ezhou
            Place/Ezhou		
        END Instance
        Instance Place/Faisalabad
            Place/Faisalabad		
        END Instance
        Instance Place/Faridabad
            Place/Faridabad		
        END Instance
        Instance Place/Fes
            Place/Fes		
        END Instance
        Instance Place/Fresno
            Place/Fresno		
        END Instance
        Instance Place/Fukuoka
            Place/Fukuoka		
        END Instance
        Instance Place/Fushun
            Place/Fushun		
        END Instance
        Instance Place/Fuzhou
            Place/Fuzhou		
        END Instance
        Instance Place/Gaziantep
            Place/Gaziantep		
        END Instance
        Instance Place/Ghaziabad
            Place/Ghaziabad		
        END Instance
        Instance Place/Giza
            Place/Giza		
        END Instance
        Instance Place/Glasgow
            Place/Glasgow		
        END Instance
        Instance Place/Goiania
            Place/Goiania		
        END Instance
        Instance Place/Greensboro
            Place/Greensboro		
        END Instance
        Instance Place/Greenville
            Place/Greenville		
        END Instance
        Instance Place/Guadalajara
            Place/Guadalajara		
        END Instance
        Instance Place/Guanghan
            Place/Guanghan		
        END Instance
        Instance Place/Guangzhou
            Place/Guangzhou		
        END Instance
        Instance Place/Guarulhos
            Place/Guarulhos		
        END Instance
        Instance Place/Guatemala
            Place/Guatemala		
        END Instance
        Instance Place/Guayaquil
            Place/Guayaquil		
        END Instance
        Instance Place/Guigang
            Place/Guigang		
        END Instance
        Instance Place/Guiyang
            Place/Guiyang		
        END Instance
        Instance Place/Gujranwala
            Place/Gujranwala		
        END Instance
        Instance Place/Gwalior
            Place/Gwalior		
        END Instance
        Instance Place/Gwangju
            Place/Gwangju		
        END Instance
        Instance Place/Hamburg
            Place/Hamburg		
        END Instance
        Instance Place/Handan
            Place/Handan		
        END Instance
        Instance Place/Hangzhou
            Place/Hangzhou		
        END Instance
        Instance Place/Hanoi
            Place/Hanoi		
        END Instance
        Instance Place/Harare
            Place/Harare		
        END Instance
        Instance Place/Harbin
            Place/Harbin		
        END Instance
        Instance Place/Harrisburg
            Place/Harrisburg		
        END Instance
        Instance Place/Havana
            Place/Havana		
        END Instance
        Instance Place/Hefei
            Place/Hefei		
        END Instance
        Instance Place/Hertford
            Place/Hertford		
        END Instance
        Instance Place/Heze
            Place/Heze		
        END Instance
        Instance Place/Hiroshima
            Place/Hiroshima		
        END Instance
        Instance Place/Ho_Chi_Minh_City
            Place/Ho_Chi_Minh_City		
        END Instance
        Instance Place/Hohhot
            Place/Hohhot		
        END Instance
        Instance Place/Houston
            Place/Houston		
        END Instance
        Instance Place/Huainan
            Place/Huainan		
        END Instance
        Instance Place/Huaiyin
            Place/Huaiyin		
        END Instance
        Instance Place/Huzhou
            Place/Huzhou		
        END Instance
        Instance Place/Hyderabad
            Place/Hyderabad		
        END Instance
        Instance Place/Ibadan
            Place/Ibadan		
        END Instance
        Instance Place/Inashiki
            Place/Inashiki		
        END Instance
        Instance Place/Indianapolis
            Place/Indianapolis		
        END Instance
        Instance Place/Indore
            Place/Indore		
        END Instance
        Instance Place/Isfahan
            Place/Isfahan		
        END Instance
        Instance Place/Istanbul
            Place/Istanbul		
        END Instance
        Instance Place/Izmir
            Place/Izmir		
        END Instance
        Instance Place/Jabalpur
            Place/Jabalpur		
        END Instance
        Instance Place/Jacksonville
            Place/Jacksonville		
        END Instance
        Instance Place/Jaipur
            Place/Jaipur		
        END Instance
        Instance Place/Jakarta
            Place/Jakarta		
        END Instance
        Instance Place/Jeddah
            Place/Jeddah		
        END Instance
        Instance Place/Jilin
            Place/Jilin		
        END Instance
        Instance Place/Jinan
            Place/Jinan		
        END Instance
        Instance Place/Jingzhou
            Place/Jingzhou		
        END Instance
        Instance Place/Jining
            Place/Jining		
        END Instance
        Instance Place/Jodhpur
            Place/Jodhpur		
        END Instance
        Instance Place/Kabul
            Place/Kabul		
        END Instance
        Instance Place/Kalyan
            Place/Kalyan		
        END Instance
        Instance Place/Kampala
            Place/Kampala		
        END Instance
        Instance Place/Kano
            Place/Kano		
        END Instance
        Instance Place/Kanpur
            Place/Kanpur		
        END Instance
        Instance Place/Kansas_City
            Place/Kansas_City		
        END Instance
        Instance Place/Karachi
            Place/Karachi		
        END Instance
        Instance Place/Kathmandu
            Place/Kathmandu		
        END Instance
        Instance Place/Kawasaki
            Place/Kawasaki		
        END Instance
        Instance Place/Kawasaki_Si
            Place/Kawasaki_Si		
        END Instance
        Instance Place/Kazan
            Place/Kazan		
        END Instance
        Instance Place/Kharkiv
            Place/Kharkiv		
        END Instance
        Instance Place/Kinshasa
            Place/Kinshasa		
        END Instance
        Instance Place/Knoxville
            Place/Knoxville		
        END Instance
        Instance Place/Kobe
            Place/Kobe		
        END Instance
        Instance Place/Kolkata
            Place/Kolkata		
        END Instance
        Instance Place/Konya
            Place/Konya		
        END Instance
        Instance Place/Kota
            Place/Kota		
        END Instance
        Instance Place/Krasnoyarsk
            Place/Krasnoyarsk		
        END Instance
        Instance Place/Kuala_Lumpur
            Place/Kuala_Lumpur		
        END Instance
        Instance Place/Kumasi
            Place/Kumasi		
        END Instance
        Instance Place/Kunming
            Place/Kunming		
        END Instance
        Instance Place/Kyoto
            Place/Kyoto		
        END Instance
        Instance Place/Lahore
            Place/Lahore		
        END Instance
        Instance Place/Laiwu
            Place/Laiwu		
        END Instance
        Instance Place/Lanzhou
            Place/Lanzhou		
        END Instance
        Instance Place/Leon
            Place/Leon		
        END Instance
        Instance Place/Leshan
            Place/Leshan		
        END Instance
        Instance Place/Lima
            Place/Lima		
        END Instance
        Instance Place/Linyi
            Place/Linyi		
        END Instance
        Instance Place/Liuzhou
            Place/Liuzhou		
        END Instance
        Instance Place/London
            Place/London		
        END Instance
        Instance Place/Los_Angeles
            Place/Los_Angeles		
        END Instance
        Instance Place/Louisville
            Place/Louisville		
        END Instance
        Instance Place/Luanda
            Place/Luanda		
        END Instance
        Instance Place/Lucknow
            Place/Lucknow		
        END Instance
        Instance Place/Ludhiana
            Place/Ludhiana		
        END Instance
        Instance Place/Luoyang
            Place/Luoyang		
        END Instance
        Instance Place/Lusaka
            Place/Lusaka		
        END Instance
        Instance Place/Luzhou
            Place/Luzhou		
        END Instance
        Instance Place/Maceio
            Place/Maceio		
        END Instance
        Instance Place/Madrid
            Place/Madrid		
        END Instance
        Instance Place/Madurai
            Place/Madurai		
        END Instance
        Instance Place/Makassar
            Place/Makassar		
        END Instance
        Instance Place/Manaus
            Place/Manaus		
        END Instance
        Instance Place/Mandalay
            Place/Mandalay		
        END Instance
        Instance Place/Manila
            Place/Manila		
        END Instance
        Instance Place/Maputo
            Place/Maputo		
        END Instance
        Instance Place/Maracaibo
            Place/Maracaibo		
        END Instance
        Instance Place/Mashhad
            Place/Mashhad		
        END Instance
        Instance Place/Mecca
            Place/Mecca		
        END Instance
        Instance Place/Medan
            Place/Medan		
        END Instance
        Instance Place/Medellin
            Place/Medellin		
        END Instance
        Instance Place/Medina
            Place/Medina		
        END Instance
        Instance Place/Meerut
            Place/Meerut		
        END Instance
        Instance Place/Melbourne
            Place/Melbourne		
        END Instance
        Instance Place/Memphis
            Place/Memphis		
        END Instance
        Instance Place/Mendoza
            Place/Mendoza		
        END Instance
        Instance Place/Mexico
            Place/Mexico		
        END Instance
        Instance Place/Miami
            Place/Miami		
        END Instance
        Instance Place/Mianyang
            Place/Mianyang		
        END Instance
        Instance Place/Milano
            Place/Milano		
        END Instance
        Instance Place/Milwaukee
            Place/Milwaukee		
        END Instance
        Instance Place/Minneapolis
            Place/Minneapolis		
        END Instance
        Instance Place/Minsk
            Place/Minsk		
        END Instance
        Instance Place/Mogadishu
            Place/Mogadishu		
        END Instance
        Instance Place/Monterrey
            Place/Monterrey		
        END Instance
        Instance Place/Montevideo
            Place/Montevideo		
        END Instance
        Instance Place/Montreal
            Place/Montreal		
        END Instance
        Instance Place/Moscow
            Place/Moscow		
        END Instance
        Instance Place/Mosul
            Place/Mosul		
        END Instance
        Instance Place/Mudanjiang
            Place/Mudanjiang		
        END Instance
        Instance Place/Multan
            Place/Multan		
        END Instance
        Instance Place/Mumbai
            Place/Mumbai		
        END Instance
        Instance Place/Munich
            Place/Munich		
        END Instance
        Instance Place/Nagoya
            Place/Nagoya		
        END Instance
        Instance Place/Nagpur
            Place/Nagpur		
        END Instance
        Instance Place/Nairobi
            Place/Nairobi		
        END Instance
        Instance Place/Nanchang
            Place/Nanchang		
        END Instance
        Instance Place/Nanchong
            Place/Nanchong		
        END Instance
        Instance Place/Nanjing
            Place/Nanjing		
        END Instance
        Instance Place/Nanning
            Place/Nanning		
        END Instance
        Instance Place/Nashville
            Place/Nashville		
        END Instance
        Instance Place/Neijiang
            Place/Neijiang		
        END Instance
        Instance Place/New_Orleans
            Place/New_Orleans		
        END Instance
        Instance Place/New_York
            Place/New_York		
        END Instance
        Instance Place/Niamey
            Place/Niamey		
        END Instance
        Instance Place/Ningbo
            Place/Ningbo		
        END Instance
        Instance Place/North_Virginia_Beach
            Place/North_Virginia_Beach		
        END Instance
        Instance Place/Novosibirsk
            Place/Novosibirsk		
        END Instance
        Instance Place/Oklahoma_City
            Place/Oklahoma_City		
        END Instance
        Instance Place/Omdurman
            Place/Omdurman		
        END Instance
        Instance Place/Omsk
            Place/Omsk		
        END Instance
        Instance Place/Oran
            Place/Oran		
        END Instance
        Instance Place/Orlando
            Place/Orlando		
        END Instance
        Instance Place/Osaka
            Place/Osaka		
        END Instance
        Instance Place/Ouagadougou
            Place/Ouagadougou		
        END Instance
        Instance Place/Palembang
            Place/Palembang		
        END Instance
        Instance Place/Paris
            Place/Paris		
        END Instance
        Instance Place/Patna
            Place/Patna		
        END Instance
        Instance Place/Pekanbaru
            Place/Pekanbaru		
        END Instance
        Instance Place/Perth
            Place/Perth		
        END Instance
        Instance Place/Philadelphia
            Place/Philadelphia		
        END Instance
        Instance Place/Phnom_Penh
            Place/Phnom_Penh		
        END Instance
        Instance Place/Phoenix
            Place/Phoenix		
        END Instance
        Instance Place/Pimpri
            Place/Pimpri		
        END Instance
        Instance Place/Pittsburgh
            Place/Pittsburgh		
        END Instance
        Instance Place/Port_Adelaide
            Place/Port_Adelaide		
        END Instance
        Instance Place/Portland
            Place/Portland		
        END Instance
        Instance Place/Porto_Alegre
            Place/Porto_Alegre		
        END Instance
        Instance Place/Prague
            Place/Prague		
        END Instance
        Instance Place/Puebla
            Place/Puebla		
        END Instance
        Instance Place/Pune
            Place/Pune		
        END Instance
        Instance Place/Pyongyang
            Place/Pyongyang		
        END Instance
        Instance Place/Qingdao
            Place/Qingdao		
        END Instance
        Instance Place/Qinzhou
            Place/Qinzhou		
        END Instance
        Instance Place/Qiqihar
            Place/Qiqihar		
        END Instance
        Instance Place/Qom
            Place/Qom		
        END Instance
        Instance Place/Quanzhou
            Place/Quanzhou		
        END Instance
        Instance Place/Quezon
            Place/Quezon		
        END Instance
        Instance Place/Quito
            Place/Quito		
        END Instance
        Instance Place/Raipur
            Place/Raipur		
        END Instance
        Instance Place/Rajkot
            Place/Rajkot		
        END Instance
        Instance Place/Raleigh
            Place/Raleigh		
        END Instance
        Instance Place/Ranchi
            Place/Ranchi		
        END Instance
        Instance Place/Rawalpindi
            Place/Rawalpindi		
        END Instance
        Instance Place/Recife
            Place/Recife		
        END Instance
        Instance Place/Rio_De_Janeiro
            Place/Rio_De_Janeiro		
        END Instance
        Instance Place/Riyadh
            Place/Riyadh		
        END Instance
        Instance Place/Rizhao
            Place/Rizhao		
        END Instance
        Instance Place/Rochester
            Place/Rochester		
        END Instance
        Instance Place/Rome
            Place/Rome		
        END Instance
        Instance Place/Rosario
            Place/Rosario		
        END Instance
        Instance Place/Rostov_On_Don
            Place/Rostov_On_Don		
        END Instance
        Instance Place/Sacramento
            Place/Sacramento		
        END Instance
        Instance Place/Saint_Louis
            Place/Saint_Louis		
        END Instance
        Instance Place/Saint_Petersburg
            Place/Saint_Petersburg		
        END Instance
        Instance Place/Saitama
            Place/Saitama		
        END Instance
        Instance Place/Salt_Lake_City
            Place/Salt_Lake_City		
        END Instance
        Instance Place/Salvador
            Place/Salvador		
        END Instance
        Instance Place/Samara
            Place/Samara		
        END Instance
        Instance Place/San_Antonio
            Place/San_Antonio		
        END Instance
        Instance Place/San_Diego
            Place/San_Diego		
        END Instance
        Instance Place/Sanaa
            Place/Sanaa		
        END Instance
        Instance Place/Santa_Cruz_De_La_Sierra
            Place/Santa_Cruz_De_La_Sierra		
        END Instance
        Instance Place/Santiago
            Place/Santiago		
        END Instance
        Instance Place/Santo_Domingo
            Place/Santo_Domingo		
        END Instance
        Instance Place/Sao_Goncalo
            Place/Sao_Goncalo		
        END Instance
        Instance Place/Sao_Luis
            Place/Sao_Luis		
        END Instance
        Instance Place/Sao_Paulo
            Place/Sao_Paulo		
        END Instance
        Instance Place/Sapporo
            Place/Sapporo		
        END Instance
        Instance Place/Seattle
            Place/Seattle		
        END Instance
        Instance Place/Semarang
            Place/Semarang		
        END Instance
        Instance Place/Sendai
            Place/Sendai		
        END Instance
        Instance Place/Seoul
            Place/Seoul		
        END Instance
        Instance Place/Shanghai
            Place/Shanghai		
        END Instance
        Instance Place/Shangqiu
            Place/Shangqiu		
        END Instance
        Instance Place/Shantou
            Place/Shantou		
        END Instance
        Instance Place/Shenyang
            Place/Shenyang		
        END Instance
        Instance Place/Shenzhen
            Place/Shenzhen		
        END Instance
        Instance Place/Shijiazhuang
            Place/Shijiazhuang		
        END Instance
        Instance Place/Shiraz
            Place/Shiraz		
        END Instance
        Instance Place/Singapore
            Place/Singapore		
        END Instance
        Instance Place/Sofia
            Place/Sofia		
        END Instance
        Instance Place/South_San_Jose_Hills
            Place/South_San_Jose_Hills		
        END Instance
        Instance Place/Srinagar
            Place/Srinagar		
        END Instance
        Instance Place/Suining
            Place/Suining		
        END Instance
        Instance Place/Suizhou
            Place/Suizhou		
        END Instance
        Instance Place/Surabaya
            Place/Surabaya		
        END Instance
        Instance Place/Surat
            Place/Surat		
        END Instance
        Instance Place/Suzhou
            Place/Suzhou		
        END Instance
        Instance Place/Sydney
            Place/Sydney		
        END Instance
        Instance Place/Tabriz
            Place/Tabriz		
        END Instance
        Instance Place/Taihe
            Place/Taihe		
        END Instance
        Instance Place/Taipei
            Place/Taipei		
        END Instance
        Instance Place/Taiyuan
            Place/Taiyuan		
        END Instance
        Instance Place/Taizhou
            Place/Taizhou		
        END Instance
        Instance Place/Tangerang
            Place/Tangerang		
        END Instance
        Instance Place/Tangshan
            Place/Tangshan		
        END Instance
        Instance Place/Taoyuan
            Place/Taoyuan		
        END Instance
        Instance Place/Tashkent
            Place/Tashkent		
        END Instance
        Instance Place/Tbilisi
            Place/Tbilisi		
        END Instance
        Instance Place/Tegucigalpa
            Place/Tegucigalpa		
        END Instance
        Instance Place/Tehran
            Place/Tehran		
        END Instance
        Instance Place/Thane
            Place/Thane		
        END Instance
        Instance Place/Tianjin
            Place/Tianjin		
        END Instance
        Instance Place/Tianshui
            Place/Tianshui		
        END Instance
        Instance Place/Tijuana
            Place/Tijuana		
        END Instance
        Instance Place/Tokyo
            Place/Tokyo		
        END Instance
        Instance Place/Toronto
            Place/Toronto		
        END Instance
        Instance Place/Tripoli
            Place/Tripoli		
        END Instance
        Instance Place/Tucson
            Place/Tucson		
        END Instance
        Instance Place/Ufa
            Place/Ufa		
        END Instance
        Instance Place/Ulaanbaatar
            Place/Ulaanbaatar		
        END Instance
        Instance Place/Ulsan
            Place/Ulsan		
        END Instance
        Instance Place/Urumqi
            Place/Urumqi		
        END Instance
        Instance Place/Varanasi
            Place/Varanasi		
        END Instance
        Instance Place/Vasai
            Place/Vasai		
        END Instance
        Instance Place/Vienna
            Place/Vienna		
        END Instance
        Instance Place/Vijayawada
            Place/Vijayawada		
        END Instance
        Instance Place/Visakhapatnam
            Place/Visakhapatnam		
        END Instance
        Instance Place/Volgograd
            Place/Volgograd		
        END Instance
        Instance Place/Warsaw
            Place/Warsaw		
        END Instance
        Instance Place/Weifang
            Place/Weifang		
        END Instance
        Instance Place/Wenzhou
            Place/Wenzhou		
        END Instance
        Instance Place/Wuhan
            Place/Wuhan		
        END Instance
        Instance Place/Wuxi
            Place/Wuxi		
        END Instance
        Instance Place/Xiamen
            Place/Xiamen		
        END Instance
        Instance Place/Xian
            Place/Xian		
        END Instance
        Instance Place/Xinyang
            Place/Xinyang		
        END Instance
        Instance Place/Xuzhou
            Place/Xuzhou		
        END Instance
        Instance Place/Yangon
            Place/Yangon		
        END Instance
        Instance Place/Yantai
            Place/Yantai		
        END Instance
        Instance Place/Yaounde
            Place/Yaounde		
        END Instance
        Instance Place/Yekaterinburg
            Place/Yekaterinburg		
        END Instance
        Instance Place/Yerevan
            Place/Yerevan		
        END Instance
        Instance Place/Yiyang
            Place/Yiyang		
        END Instance
        Instance Place/Yokohama
            Place/Yokohama		
        END Instance
        Instance Place/Zaozhuang
            Place/Zaozhuang		
        END Instance
        Instance Place/Zapopan
            Place/Zapopan		
        END Instance
        Instance Place/Zhanjiang
            Place/Zhanjiang		
        END Instance
        Instance Place/Zhengzhou
            Place/Zhengzhou		
        END Instance
        Instance Place/Zibo
            Place/Zibo		
        END Instance
        Instance Place/Zigong
            Place/Zigong		
        END Instance
        Instance Place/Ziyang
            Place/Ziyang		
        END Instance
    END References

END Scenario
