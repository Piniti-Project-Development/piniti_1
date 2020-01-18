package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import fragment.BuySellFragment;
import fragment.DeliveryFragment;
import fragment.DesignFragment;
import fragment.DevotionalServiceFragment;
import fragment.FarmAgriFragment;
import fragment.FinancialServicesFragment;
import fragment.HomeServicesFragment;
import fragment.HotelsFragment;
import fragment.RepairFragment;
import fragment.BeautyFragment;
import fragment.ElectricianFragment;
import fragment.HealthFragment;
import fragment.CleaningFragment;
import fragment.PackShiftFragment;
import fragment.PaintingFragment;
import fragment.PestControlFragment;
import fragment.PlumberFragment;
import fragment.TutorFragment;
import fragment.WeddingEventsFragment;


public class CategoryPagerAdapterAllServices extends FragmentPagerAdapter {

        int mNoOfTabs;

        public CategoryPagerAdapterAllServices(FragmentManager fm, int NumberOfTabs)

        {
                super(fm);
                this.mNoOfTabs = NumberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
                switch (position) {

                        case 0:
                                BeautyFragment tab1 = new BeautyFragment();
                                return tab1;
                        case 1:
                                RepairFragment tab2 = new RepairFragment();
                                return tab2;
                        case 2:
                                CleaningFragment tab3 = new CleaningFragment();
                                return tab3;

                        case 3:
                                WeddingEventsFragment tab4 = new WeddingEventsFragment();
                                return tab4;

                        case 4:
                                PaintingFragment tab5 = new PaintingFragment();
                                return tab5;

                        case 5:
                                PestControlFragment tab6 = new PestControlFragment();
                                return tab6;

                        case 6:
                                PackShiftFragment tab7 = new PackShiftFragment();
                                return tab7;

                        case 7:
                                PlumberFragment tab8 = new PlumberFragment();
                                return tab8;

                        case 8:
                                BuySellFragment tab9 = new BuySellFragment();
                                return tab9;
                        case 9:
                                DeliveryFragment tab10 = new DeliveryFragment();
                                return tab10;
                        case 10:
                                DesignFragment tab11 = new DesignFragment();
                                return tab11;
                        case 11:
                                DevotionalServiceFragment tab12 = new DevotionalServiceFragment();
                                return tab12;
                        case 12:
                                ElectricianFragment tab13 = new ElectricianFragment();
                                return tab13;

                        case 13:
                                FarmAgriFragment tab14 = new FarmAgriFragment();
                                return tab14;

                        case 14:
                                FinancialServicesFragment tab15 = new FinancialServicesFragment();
                                return tab15;

                        case 15:
                                HealthFragment tab16 = new HealthFragment();
                                return tab16;

                        case 16:
                                HomeServicesFragment tab17 = new HomeServicesFragment();
                                return tab17;

                        case 17:
                                HotelsFragment tab18 = new HotelsFragment();
                                return tab18;

                        case 18:
                                PackShiftFragment tab19 = new PackShiftFragment();
                                return tab19;
                        case 19:
                                PackShiftFragment tab20 = new PackShiftFragment();
                                return tab20;
                        case 20:
                                PackShiftFragment tab21 = new PackShiftFragment();
                                return tab21;
                        case 21:
                                PackShiftFragment tab22 = new PackShiftFragment();
                                return tab22;
                        case 22:
                                PackShiftFragment tab23 = new PackShiftFragment();
                                return tab23;

                        case 23:
                                PackShiftFragment tab24 = new PackShiftFragment();
                                return tab24;

                        case 24:
                                PackShiftFragment tab25 = new PackShiftFragment();
                                return tab25;

                        case 25:
                                PackShiftFragment tab26 = new PackShiftFragment();
                                return tab26;

                        case 26:
                                PackShiftFragment tab27 = new PackShiftFragment();
                                return tab27;
                        case 27:
                                TutorFragment tab28 = new TutorFragment();
                                return tab28;

                        case 28:
                                WeddingEventsFragment tab29 = new WeddingEventsFragment();
                                return tab29;
                        default:
                                return null;

                }
        }

        @Override
        public int getCount() {
                return mNoOfTabs;

        }
}

