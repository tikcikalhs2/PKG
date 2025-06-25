import tkinter as tk

poin=0
app = tk.Tk()
app.title('Aplikasi')
app.geometry('300x300')

def add_one():
    global poin
    poin=poin+1
    label1.config(text=f'jumlah point:{poin}')

def add_five():
    global poin
    poin=poin+5
    label1.config(text=f'jumlah point:{poin}')

def add_ten():
    global poin
    poin=poin+10
    label1.config(text=f'jumlah point:{poin}')


label1=tk.Label(app,text='Klik Tombol')
label1.pack()
btn1=tk.Button(app,text='+1', command=lambda:add_one())
btn1.pack()
btn2=tk.Button(app,text='+5', command=lambda:add_five())
btn2.pack()
btn3=tk.Button(app,text='+10', command=lambda:add_ten())
btn3.pack()




app.mainloop()