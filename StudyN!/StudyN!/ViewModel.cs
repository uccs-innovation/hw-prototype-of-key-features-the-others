using System.Collections.Generic;
using System.ComponentModel;

namespace StudyN_
{
    public class EventDataViewModel : INotifyPropertyChanged
    {
        readonly EventData data;

        public event PropertyChangedEventHandler PropertyChanged;
        public IReadOnlyList<Event> Events { get => data.Events; }

        public EventDataViewModel()
        {
            data = new EventData();
        }

        protected void RaisePropertyChanged(string name)
        {
            if (PropertyChanged != null)
                PropertyChanged(this, new PropertyChangedEventArgs(name));
        }
    }
}